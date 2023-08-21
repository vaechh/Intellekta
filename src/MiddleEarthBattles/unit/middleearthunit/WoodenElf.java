package com.intellekta.generics.middleearth.unit.middleearthunit;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.type.Infantry;

public class WoodenElf extends AbstractUnit implements MiddleEarthUnit, Infantry {
    public WoodenElf(String name){
        super(6,6, name);
    }
}
