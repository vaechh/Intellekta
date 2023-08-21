package OOPBase.Encapsulation;

class Cat extends Animal {
    private String regnum; // царство, к которому принадлежит семейство

    public String getRegnum() {
        return regnum;
    }

    private String phylum; // тип, к котрому принадлежит семейство

    public String getPhylum() {
        return phylum;
    }

    private String classis; // класс, к которому принадлежит семейство

    public String getClassis() {
        return classis;
    }

    private String ordo; // отряд, к которому принадлежит семейство

    public String getOrdo() {
        return ordo;
    }

    public Cat(String regio, String regnum, String phylum, String classis, String ordo){
        super(regio);
        this.regnum = regnum;
        this.phylum = phylum;
        this.classis = classis;
        this.ordo = ordo;
    }
}
