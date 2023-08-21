package SortAlgorithms;

public class BubbleSort {
    public static void sortSales(double[] sales, String[] countries){
        if(sales.length != countries.length)
            System.out.println("Corrupted Data");
        else if(sales.length == 0 && countries.length == 0)
            System.out.println("Empty Data");
        else {
            for(int i=1; i<sales.length;i++)
                for(int j=0;j<sales.length-i;j++)
                    if(sales[j] < sales[j+1])
                    {
                        double temp = sales[j+1];
                        sales[j+1] = sales[j];
                        sales[j] = temp;

                        String country = countries[j+1];
                        countries[j+1] = countries[j];
                        countries[j] = country;

                        //printData(countries, sales);
                    }
            //printData(countries,sales);
        }
    }
}
