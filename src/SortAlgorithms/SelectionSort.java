package SortAlgorithms;

public class SelectionSort {
    public static void sortSales(double[] sales, String[] countries){
        if(sales.length != countries.length)
            System.out.println("Corrupted Data");
        else if(sales.length == 0 && countries.length == 0)
            System.out.println("Empty Data");
        else {
            int l = 0;
            int r = sales.length-1;
            while(l < r)
            {
                double max = sales[l];
                int maxIndex = l;
                double min = sales[r];
                int minIndex = r;

                for(int i = l; i < r; i++)
                {
                    if(sales[i] > max) {
                        max = sales[i];
                        maxIndex = i;
                    }
                    if(sales[i] < min) {
                        min = sales[i];
                        minIndex = i;
                    }
                }

                double tempMin = sales[l];
                sales[l] = min;
                sales[minIndex] = tempMin;

                String countryMin = countries[l];
                countries[l] = countries[minIndex];
                countries[minIndex] = countryMin;

                if(r != minIndex) {
                    double tempMax = sales[r];
                    sales[r] = max;
                    sales[maxIndex] = tempMax;

                    String countryMax = countries[r];
                    countries[r] = countries[maxIndex];
                    countries[maxIndex] = countryMax;
                }

                l++;
                r--;

                //printData(countries,sales);
            }
            //printData(countries,sales);
        }
    }
}
