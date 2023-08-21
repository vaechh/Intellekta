package OOPBase.Encapsulation;

public class Animal {
    private String regio; // домен, к которому принадлежит семейство

    public String getRegio() {
        return regio;
    }

    protected void setRegio(String regio) {
        this.regio = regio;
    }

    public Animal(String regio) {
        this.regio = regio;
    }
}
