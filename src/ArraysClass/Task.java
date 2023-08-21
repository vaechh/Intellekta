package ArraysClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {

    public static double[] findAllWinners(double[] staff){
        if(staff == null || staff.length == 0)
            return new double[]{};

        int count = staff.length;

        double [] sorted_staff = Arrays.copyOfRange(staff,0,count);
        Arrays.sort(sorted_staff);

        int i = 0;
        int j = count - 1;
        int winnersCount = 0;

        while(i != 3 && j > 0)
        {
            if(Array.getDouble(sorted_staff, j) != Array.getDouble(sorted_staff, j - 1))
                i++;
            winnersCount++;
            j--;
        }

        if(sorted_staff.length >= 3)
            return(Arrays.copyOfRange(sorted_staff,count-winnersCount,count));
        else
            return sorted_staff;
    }
    public static int peopleChoiceAward(double[] staff, int winnersCount){
        if(staff == null || staff.length == 0 || winnersCount < 0 || winnersCount > staff.length)
            return -1;

        double [] sorted_staff = Arrays.copyOfRange(staff,0,staff.length);
        Arrays.sort(sorted_staff);

        int index = Arrays.binarySearch(sorted_staff,0,sorted_staff.length - winnersCount,1500.0);

        return Math.max(index, -1);
    }
}
