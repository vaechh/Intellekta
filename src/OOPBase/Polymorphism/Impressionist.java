package OOPBase.Polymorphism;

class Impressionist extends Client{
    Impressionist(String lastName, String firstName, String secondName, int amountOfBoughtDrawings, int fortune){
        super(lastName, firstName, secondName, amountOfBoughtDrawings, fortune);
    }

    @Override
    public String preferredStyleOfDrawings() {
        return "I prefer impressionism";
    }
}
