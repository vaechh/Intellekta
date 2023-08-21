package Collections.MutableArrays;

class CardCustomer extends Customer {
    private String cardNumber;
    public String getCardNumber(){
        return cardNumber;
    }
    public CardCustomer(String name, String cardNumber, int purchaseCount){
        super(purchaseCount, name);

        if(cardNumber == null || cardNumber.isBlank() || cardNumber.isBlank() || cardNumber.length() != 16)
            this.cardNumber = "0000000000000000";
        else
            this.cardNumber = cardNumber;
    }

    @Override
    void customerInfo() {
        super.customerInfo("card: " + cardNumber);
    }
}
