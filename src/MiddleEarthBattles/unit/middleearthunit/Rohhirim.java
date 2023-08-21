package com.intellekta.generics.middleearth.unit.middleearthunit;

import com.intellekta.generics.middleearth.unit.AbstractCavalryUnit;
import com.intellekta.generics.middleearth.unit.type.Cavalry;

public class Rohhirim extends AbstractCavalryUnit implements Human,MiddleEarthUnit, Cavalry {
    public Rohhirim(String name){
        super(maxPower,minPower,name);
        this.horse = new Horse();
    }
}
