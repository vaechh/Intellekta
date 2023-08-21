package com.intellekta.generics.middleearth.unit;

import java.util.Random;

public abstract class AbstractUnit implements Unit {
    private int power;
    protected void registerDmg(int dmg){
        if(dmg < 0) return;
        power -= dmg;
    }
    protected int getPower(){
        return this.power;
    }
    private String name;
    public boolean isAlive(){
        return power > 0;
    }
    public AbstractUnit(int maxPower, int minPower, String name){
        Random rnd = new Random();
        if(maxPower == minPower)
            this.power = minPower;
        else
            this.power = rnd.nextInt(minPower - 1, maxPower + 1);

        if(name == null || name.isEmpty() || name.isBlank())
            this.name = super.toString();
        else
            this.name = name;
    }
    public <T extends AbstractUnit> void strike(T enemy){
        enemy.registerDmg(getPower());
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(" ").append(this.name).append(" has power ").append(this.getPower());
        return sb.toString();
    }
}
