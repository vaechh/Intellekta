package com.intellekta.generics.middleearth.unit.mordorunit;

import com.intellekta.generics.middleearth.unit.AbstractCavalryUnit;
import com.intellekta.generics.middleearth.unit.type.Cavalry;

import java.util.Random;

public class UrukHai extends AbstractCavalryUnit implements Orc, MordorUnit, Cavalry {
    public UrukHai(String name){
        super(maxPower,minPower,name);
        this.warg = new Warg();
    }
}
