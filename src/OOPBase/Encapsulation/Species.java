package OOPBase.Encapsulation;

public class Species extends Cat {
    private String nameOfSpecie; // название вида

    public String getNameOfSpecie() {
        return nameOfSpecie;
    }

    private String subfamilia; // подсемейство, к которому принадлежит данный вид

    public String getSubfamilia() {
        return subfamilia;
    }

    private String genus; // род, к которому принадлежит данный вид

    public String getGenus() {
        return genus;
    }

    public Species(String regio, String regnum, String phylum, String classis, String ordo, String subfamilia, String genus){
        super(regio,regnum,phylum,classis,ordo);
        this.subfamilia = subfamilia;
        this.genus = genus;
    }
}