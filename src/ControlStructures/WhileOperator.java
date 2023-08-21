package ControlStructures;

public class WhileOperator {
    public static void main(String[] args){

    }
    public static void checkWeightWhileDo(double[] weights){
        final double standard = 0.050;
        double weightSum = 0;
        int i = 0;

        while(i < weights.length)
            weightSum += weights[i++];

        double avg = weights.length > 0? weightSum / weights.length: 0;

        if(avg > (standard - standard * 0.1))
            System.out.println("Ok");
        else
            System.out.println("Not enough substance");
    }
    public static void checkWeightDoWhile(double[] weights){
        final double standard = 0.050;
        double weightSum = 0;
        int i = 0;

        if(weights.length > 0) {
            do {
                weightSum += weights[i++];
            }
            while (i < weights.length);

            if(weightSum / weights.length > (standard - standard * 0.1))
                System.out.println("Ok");
            else
                System.out.println("Not enough substance");
        }
        else
            System.out.println("Not enough substance");
    }
}
