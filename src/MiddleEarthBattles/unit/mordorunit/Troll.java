package com.intellekta.generics.middleearth.unit.mordorunit;

import com.intellekta.generics.middleearth.unit.AbstractUnit;
import com.intellekta.generics.middleearth.unit.type.Infantry;

public class Troll extends AbstractUnit implements MordorUnit, Infantry {
    public Troll(String name){
        super(15,11,name);
    }
}
