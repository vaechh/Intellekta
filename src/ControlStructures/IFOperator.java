package ControlStructures;

public class IFOperator {
    public static void main(String[] args){
        boolean isUInArgs = false;
        boolean isSInArgs = false;
        String answer = "Hello";

        if(args.length > 0){
            for(int i = 0; i < args.length; i++) {
                if (args[i] == "-u")
                    isUInArgs = true;
                if (args[i] == "-s")
                    isSInArgs = true;
            }

            if(isUInArgs) {
                answer += ", " + System.getProperty("user.name");
                if(isSInArgs)
                    answer += " of "+System.getProperty("os.name");
            }

            if(isSInArgs && !isUInArgs)
                answer += ", " + System.getProperty("os.name");
        }
        System.out.println(answer + "!");
    }
}