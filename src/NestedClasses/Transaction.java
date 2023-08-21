package NestedClasses;

class Transaction{
    private double price;

    public double getPrice() {
        return price;
    }
    private double tax = 1.2;

    Transaction(){
        this.price = 0.0;
    }
    double dealPrice(){
        return price * tax;
    }
    private void printCheck(double price){
        System.out.println(String.format("price: %.2f",price));
    }
    public void printCheck(){
        System.out.print("Order ");
        printCheck(price);
        System.out.print("Total ");
        printCheck(dealPrice());
    }
    class TransactionItem extends ProductInfo{
        TransactionItem(double price, String name){
            if(name == null || name.isEmpty() || name.isBlank())
                this.name = "Default";
            else
                this.name = name;

            if(price < 0.0)
                price = 0;
            else
            {
                this.price = price;
                getTransaction().price += price;
            }
        }
        Transaction getTransaction(){
            return Transaction.this;
        }
        void printInfo(){
            System.out.printf("Item: ,");
            getTransaction().printCheck(price);
        }
    }

}
