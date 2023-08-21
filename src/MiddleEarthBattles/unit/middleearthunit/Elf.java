package com.intellekta.generics.middleearth.unit.middleearthunit;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.type.Infantry;

public class Elf extends AbstractUnit implements MiddleEarthUnit, Infantry {
    public Elf(String name){
        super(7,4, name);
    }
}
