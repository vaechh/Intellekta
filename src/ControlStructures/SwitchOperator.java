package ControlStructures;

public class SwitchOperator {
    public static void main(String[] args){
        String answer = "Hello";
        if(args.length > 0) {
            switch (args[0]) {
                case "-u":
                    answer += ", " + System.getProperty("user.name");
                    break;
                case "-s":
                    answer += ", " + System.getProperty("os.name");
                    break;
                case "-su":
                case "-us":
                    answer += ", " + System.getProperty("user.name") + " of " + System.getProperty("os.name");
                    break;
            }
        }
        System.out.println(answer + "!");
    }
}
