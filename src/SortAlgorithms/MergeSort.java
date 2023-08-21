package SortAlgorithms;

public class MergeSort {
    static void mergeSort(double[] array,String[] countries){
        if(array.length != countries.length){
            System.out.println("Corrupted Data");
            return;
        }
        else if(array.length == 0 && countries.length == 0) {
            System.out.println("Empty Data");
            return;
        }

        double[] leftArray = new double[array.length / 2];
        double[] rightArray = new double[array.length - leftArray.length];
        String[] leftCountries = new String[array.length / 2];
        String[] rightCountries = new String[array.length - leftArray.length];


        for (int i = 0; i < array.length; i++) {
            if(i < leftArray.length) {
                leftArray[i] = array[i];
                leftCountries[i] = countries[i];
            }
            else {
                rightArray[i - leftArray.length] = array[i];
                rightCountries[i - leftArray.length] = countries[i];
            }
        }

        if(rightArray.length>1) {
            mergeSort(leftArray, leftCountries);
            mergeSort(rightArray, rightCountries);
        }

        int leftId = 0;
        int rightId = 0;

        for (int i = 0; i < array.length; i++) {
            if(leftId==leftArray.length && rightId<rightArray.length) {
                countries[i] = rightCountries[rightId];
                array[i] = rightArray[rightId++];
            }
            else if (rightId==rightArray.length && leftId<leftArray.length) {
                countries[i] = leftCountries[leftId];
                array[i] = leftArray[leftId++];
            }
            else {
                countries[i] = (leftArray[leftId] < rightArray[rightId]) ? leftCountries[leftId] : rightCountries[rightId];
                array[i] = (leftArray[leftId] < rightArray[rightId]) ? leftArray[leftId++] : rightArray[rightId++];
            }
        }
        //printData(countries,array);
    }
}
