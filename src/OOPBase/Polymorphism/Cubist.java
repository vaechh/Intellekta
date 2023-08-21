package OOPBase.Polymorphism;

class Cubist extends Client{
    Cubist(String lastName, String firstName, String secondName, int amountOfBoughtDrawings, int fortune){
        super(lastName, firstName, secondName, amountOfBoughtDrawings, fortune);
    }

    @Override
    public String preferredStyleOfDrawings() {
        return "I prefer cubism";
    }
}
