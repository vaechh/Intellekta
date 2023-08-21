package com.intellekta.generics.middleearth;

import java.util.ArrayList;
import java.util.Random;

import com.intellekta.generics.middleearth.unit.Unit;
import com.intellekta.generics.middleearth.unit.type.Cavalry;
import com.intellekta.generics.middleearth.unit.type.Infantry;

public class Army <T extends Unit>{
    ArrayList<Cavalry> cavalry = new ArrayList<>();
    ArrayList<Infantry> infantry = new ArrayList<>();

    public ArrayList<Cavalry> getCavalry() {
        return cavalry;
    }

    public ArrayList<Infantry> getInfantry() {
        return infantry;
    }

    public ArrayList<Unit> getArmy(){
        ArrayList<Unit> allArmy = new ArrayList<>();
        allArmy.addAll(cavalry);
        allArmy.addAll(infantry);

        return allArmy;
    }

    public boolean recruit(T warrior){
        if (warrior == null)
            return false;

        if(warrior instanceof Cavalry)
            cavalry.add((Cavalry) warrior);
        else
            infantry.add((Infantry) warrior);

        return true;
    }

    public void print(){
        for(var warrior : cavalry)
            System.out.println(warrior.toString());

        for(var warrior : infantry)
            System.out.println(warrior.toString());
    }

    public boolean release(T warrior){
        if(warrior != null)
        {
            if(warrior instanceof Cavalry && !cavalry.isEmpty())
                cavalry.remove(warrior);
            else if(warrior instanceof Infantry && !infantry.isEmpty())
                infantry.remove(warrior);
            else
                return false;

            return true;
        }
        else
            return false;
    }

    public T getRandomUnit(){
        Random random = new Random();
        T randomUnit = null;

        if(random.nextBoolean()){
            if(cavalry.size() > 0)
                randomUnit = (T)cavalry.get(random.nextInt(0,cavalry.size()));
        }
        else {
            if(infantry.size() > 0)
                randomUnit = (T)infantry.get(random.nextInt(0,infantry.size()));
        }

        return randomUnit;
    }

    public T getRandomUnit(T warrior){
        Random random = new Random();
        T randomUnit = null;

        if(warrior instanceof Cavalry){
            if(cavalry.size() > 0)
                randomUnit = (T)cavalry.get(random.nextInt(0,cavalry.size()));
        }
        else {
            if(infantry.size() > 0)
                randomUnit = (T)infantry.get(random.nextInt(0,infantry.size()));
        }

        return randomUnit;
    }
}
