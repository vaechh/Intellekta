package Collections.MutableArrays;

import java.util.ArrayList;
import java.util.Scanner;

class Shop{
    private ArrayList <Customer> shopCustomers = new ArrayList<Customer>();
    public void printShopSummary(){
        for(Customer client : shopCustomers)
            client.customerInfo();
    }
    public static Shop createShopInfo(){
        Scanner scan = new Scanner(System.in);
        Shop result = new Shop();

        while(!scan.hasNext("exit")){
            String line = scan.nextLine();
            String []data = line.split(",");

            if(data.length != 5)
            {
                String newData[] = new String[5];
                int j = 0;
                int i = 0;
                while(j != 5){
                    if(i < data.length) {
                        newData[j] = data[i];
                        i++;
                    }
                    else {
                        newData[j] = "";
                    }
                    j++;
                }
                data = newData;
            }

            if (data[0].intern() == "1")
                result.shopCustomers.add(new CashCustomer(data[1], data[3], Integer.parseInt(data[2])));
            else
                result.shopCustomers.add(new CardCustomer(data[1], data[4], Integer.parseInt(data[2])));
        }

        return result;
    }
}