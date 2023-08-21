package OOPBase.Polymorphism;

public class Client{
    String lastName;

    String firstName;

    String secondName;

    int amountOfBoughtDrawings;

    int fortune;

    Client(String lastName, String firstName, String secondName, int amountOfBoughtDrawings, int fortune){
        this.lastName = lastName == null ?
                "default" : lastName;
        this.firstName = firstName == null ?
                "client" : firstName;
        this.secondName = secondName == null ?
                "absolute" : secondName;
        this.amountOfBoughtDrawings = Math.max(amountOfBoughtDrawings, 0);
        this.fortune = Math.max(fortune, 0);
    }

    public String preferredStyleOfDrawings(){
        return "No preferred style";
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name: ");
        str.append(this.lastName).append(" ").append(this.firstName).append(" ").append(this.secondName).append("\n");
        str.append("Amount of bought drawings: ").append(this.amountOfBoughtDrawings).append("\n");
        str.append("Fortune: ").append(this.fortune).append("\n");
        str.append("Style: ").append(preferredStyleOfDrawings());

        return str.toString();
    }
}
