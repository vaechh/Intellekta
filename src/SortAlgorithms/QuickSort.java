package SortAlgorithms;

public class QuickSort {
    public static void Qsort(double[] sales, String[] countries, int L, int R) {
        int i=L,j=R;
        double w,x;
        String country;

        x=sales[(L+R)/2];
        do{
            while(sales[i]<x) i++;
            while(sales[j]>x) j--;
            if(i <= j){
                w = sales[i];
                sales[i] = sales[j];
                sales[j] = w;

                country = countries[i];
                countries[i] = countries[j];
                countries[j] = country;

                i++;
                j--;
            }
        }while(i < j);
        if(L < j) Qsort(sales,countries,L,j);
        if(i < R) Qsort(sales,countries,i,R);
    }
    public static void sortStoreSales(String[] countries, double[] sales){
        if(sales.length != countries.length)
            System.out.println("Corrupted Data");
        else if(sales.length == 0 && countries.length == 0)
            System.out.println("Empty Data");
        else{
            Qsort(sales,countries,0,sales.length-1);
            //printData(countries,sales);
        }
    }
}
