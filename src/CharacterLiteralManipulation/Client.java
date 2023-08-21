package CharacterLiteralManipulation;

public class Client {
    long id;

    String type;

    String name;

    double sum;

    public Client(long _id, String _type, String _name, double _sum){
        id = Math.max(_id, 1000000000000L);
        if(!_type.intern().equals("institution") && !_type.intern().equals("individual"))
            type = "institution";
        else
            type = _type;
        name = _name == null ? "Default" : _name;
        sum = _sum < 0 ? 0 : _sum;
    }
}
