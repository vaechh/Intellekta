package com.intellekta.generics.middleearth.unit.middleearthunit;

import com.intellekta.generics.middleearth.unit.AbstractCavalryUnit;
import com.intellekta.generics.middleearth.unit.type.Cavalry;

public class Wizard extends AbstractCavalryUnit implements MiddleEarthUnit, Cavalry{
    public Wizard(String name){
        super(20,20,name);
        this.horse = new Horse();
    }
}
