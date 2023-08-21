package com.intellekta.generics.middleearth;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.Unit;
import com.intellekta.generics.middleearth.unit.middleearthunit.*;
import com.intellekta.generics.middleearth.unit.mordorunit.Goblin;
import com.intellekta.generics.middleearth.unit.mordorunit.MordorUnit;
import com.intellekta.generics.middleearth.unit.mordorunit.Troll;
import com.intellekta.generics.middleearth.unit.mordorunit.UrukHai;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Battle{
    private static final int MIN_ARMY_COUNT = 40;

    private static final int MAX_ARMY_COUNT = 60;

    private static int sizeOfFirstArmy = -1;

    static Random rnd = new Random();

    private static <T extends Unit> Unit getRandomUnit(boolean mordorType){
        if (mordorType) {
            int result = rnd.nextInt(3) + 1;

            return switch (result) {
                case 1 -> new Goblin("");
                case 2 -> new Troll("");
                case 3 -> new UrukHai("");
                default -> null;
            };
        }
        else {
            int result = rnd.nextInt(3) + 1;

            return switch (result) {
                case 1 -> new Elf("");
                case 2 -> new WoodenElf("");
                case 3 -> new Rohhirim("");
                default -> null;
            };
        }
    }
    static private <T extends Unit> void fillArmy(Army<T> army, boolean mordorType){
        System.out.println("Army of " + (mordorType ? "Mordor ": "MiddleEarth ") + "consists of:");
        int armySize = rnd.nextInt(MIN_ARMY_COUNT,MAX_ARMY_COUNT);

        if(sizeOfFirstArmy != -1)
            armySize = rnd.nextInt(sizeOfFirstArmy - (int)(sizeOfFirstArmy * 0.1),
                    sizeOfFirstArmy + (int)(sizeOfFirstArmy * 0.1));

        for(int i = 0; i < armySize; i++)
            army.recruit((T)getRandomUnit(mordorType));

        if(army instanceof MiddleEarthUnit)
            if(rnd.nextBoolean())
                army.recruit((T) new Wizard("Gandalf"));

        sizeOfFirstArmy = armySize;
    }
    private static <T extends AbstractUnit> void duel(T u1, T u2){
        if(u1 != null && u2 != null && u1.isAlive() && u2.isAlive()) {
            if (rnd.nextBoolean()) {
                System.out.print(u1.toString() + " strikes " + u2.toString());
                u1.strike(u2);
                System.out.println(" and " + (u2.isAlive() ? "does not kill him" : "kills him"));

                if (u2.isAlive()) {
                    System.out.print(u2.toString() + " strikes " + u1.toString());
                    u2.strike(u1);
                    System.out.println(" and " + (u1.isAlive() ? "does not kill him" : "kills him"));
                }
            } else {
                System.out.print(u2.toString() + " strikes " + u1.toString());
                u2.strike(u1);
                System.out.println(" and " + (u1.isAlive() ? "does not kill him" : "kills him"));

                if (u1.isAlive()) {
                    System.out.print(u1.toString() + " strikes " + u2.toString());
                    u1.strike(u2);
                    System.out.println(" and " + (u2.isAlive() ? "does not kill him" : "kills him"));
                }
            }
        }
    }
    private static <T extends Unit> void clearDeadmans(Army<T> army){
        Iterator i = army.getArmy().iterator();

        while(i.hasNext()){
            AbstractUnit unit = (AbstractUnit)i.next();
            if (!(unit.isAlive()))
                army.release((T)unit);
        }
    }
    private static void printResults(List<?> army){
        for(var warrior : army){
            System.out.println(warrior.toString());
        }
    }
    private static void fight(Army<MordorUnit> mordorArmy, Army<MiddleEarthUnit> middleEarthArmy){
        System.out.println("Phase 1:");
        while (mordorArmy.cavalry.size() > 0 && middleEarthArmy.cavalry.size() > 0){
            duel((AbstractUnit)middleEarthArmy.getRandomUnit((MiddleEarthUnit)middleEarthArmy.cavalry.get(0)),
                    (AbstractUnit)mordorArmy.getRandomUnit((MordorUnit)mordorArmy.cavalry.get(0)));

            clearDeadmans(mordorArmy);
            clearDeadmans(middleEarthArmy);
        }
        System.out.println("Army of " + (mordorArmy.cavalry.size() > 0 ? "Mordor " : "Middle Earth ") + "has won the 1 phase. The winners list:");
        if(mordorArmy.cavalry.size() > 0)
            printResults(mordorArmy.cavalry);
        else
            printResults(middleEarthArmy.cavalry);

        System.out.println("Phase 2:");
        while (mordorArmy.infantry.size() > 0 && middleEarthArmy.infantry.size() > 0){
            duel((AbstractUnit)middleEarthArmy.getRandomUnit((MiddleEarthUnit)middleEarthArmy.infantry.get(0)),
                    (AbstractUnit)mordorArmy.getRandomUnit((MordorUnit)mordorArmy.infantry.get(0)));

            clearDeadmans(mordorArmy);
            clearDeadmans(middleEarthArmy);
        }
        System.out.println("Army of " + (mordorArmy.infantry.size() > 0 ? "Mordor " : "Middle Earth ") + "has won the 2 phase. The winners list:");
        if(mordorArmy.infantry.size() > 0)
            printResults(mordorArmy.infantry);
        else
            printResults(middleEarthArmy.infantry);

        if(mordorArmy.getArmy().size() != 0 && middleEarthArmy.getArmy().size() != 0)
        {
            System.out.println("Phase 3:");

            while(mordorArmy.getArmy().size() != 0 && middleEarthArmy.getArmy().size() != 0){
                duel((AbstractUnit)middleEarthArmy.getRandomUnit(),
                        (AbstractUnit)mordorArmy.getRandomUnit());

                clearDeadmans(mordorArmy);
                clearDeadmans(middleEarthArmy);
            }

            System.out.println("Army of " + (mordorArmy.infantry.size() > 0 ? "Mordor " : "Middle Earth ") + "has won the 3 phase. The winners list:");
            if(mordorArmy.infantry.size() > 0)
                printResults(mordorArmy.infantry);
            else
                printResults(middleEarthArmy.infantry);
        }

        if(mordorArmy.getArmy().size() > 0)
        {
            System.out.println("Army of Mordor has won the battle. The winners list:");
            mordorArmy.print();
        }
        else
        {
            System.out.println("Army of Middle Earth has won the battle. The winners list:");
            middleEarthArmy.print();
        }
    }
    static public void fight(){
        Army<MordorUnit> mordorArmy = new Army<>();
        fillArmy(mordorArmy, true);
        mordorArmy.print();

        Army<MiddleEarthUnit> middleEarthArmy = new Army<>();
        fillArmy(middleEarthArmy, false);
        middleEarthArmy.print();

        fight(mordorArmy,middleEarthArmy);
    }
}