package com.intellekta.generics.middleearth.unit.mordorunit;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.type.Infantry;

public class Goblin extends AbstractUnit implements MordorUnit, Infantry {
    public Goblin(String name){
        super(5,2, name);
    }
}
