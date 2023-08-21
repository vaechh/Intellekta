package com.intellekta.generics.middleearth.unit;

public abstract class AbstractCavalryUnit extends AbstractUnit{
    public Horse horse = null;
    public Warg warg = null;
    @Override
    protected int getPower(){
        if(horse != null && horse.isAlive())
            return horse.getPower() + super.getPower();
        else if (warg != null && warg.isAlive())
            return warg.getPower() + super.getPower();

        return super.getPower();
    }
    @Override
    protected void registerDmg(int dmg){
        if(horse != null && horse.isAlive())
            horse.registerDmg(dmg);
        else if(warg != null && warg.isAlive())
            warg.registerDmg(dmg);
        else
            super.registerDmg(dmg);
    }
    @Override
    public <T extends AbstractUnit> void strike(T enemy){
        enemy.registerDmg(getPower());
    }
    public AbstractCavalryUnit(int maxPower, int minPower, String name) {
        super(maxPower, minPower, name);
    }
    public class Horse extends AbstractUnit{
        public Horse() {
            super(5, 4,"");
        }
    }
    public class Warg extends AbstractUnit{
        public Warg() {
            super(7, 4,"");
        }
    }
}
