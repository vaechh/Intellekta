package NestedClasses;

class Receipt{
    public static void printReceipt(ProductInfo [] products){
        Transaction transaction = new Transaction();
        for(ProductInfo product : products){
            transaction.new TransactionItem(product.price, product.name).printInfo();
        }
        transaction.printCheck();
    }
    public static void printTransactionInfo(Transaction.TransactionItem ti){
        ti.getTransaction().printCheck();
    }
}
