package ControlStructures;

public class ForOperator {
    public static void main(String[] args){

    }
    public static void checkWeight(double[] weights){
        final double standard = 0.050;
        boolean isEnough = false;

        for(int i = 0; i < weights.length; i+=3){
            if(weights[i] < (standard - standard * 0.1)) {
                isEnough = false;
                break;
            }
            else
                isEnough = true;
        }

        if(isEnough)
            System.out.println("Ok");
        else
            System.out.println("Not enough substance");
    }
}
