package ControlStructures;

public class TernaryOperator {
    public static void main(String[] args){
        if(args.length > 0)
            System.out.println("Hello"+(args[0] == "-u"?", " + System.getProperty("user.name"): "") + "!");
        else
            System.out.println("Hello!");
    }
}
