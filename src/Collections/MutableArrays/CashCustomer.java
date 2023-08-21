package Collections.MutableArrays;

class CashCustomer extends Customer {
    private String documentNumber;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public CashCustomer(String name, String documentNumber, int purchaseCount) {
        super(purchaseCount, name);

        if (documentNumber == null || documentNumber.isEmpty() ||
                documentNumber.isBlank() || documentNumber.length() != 11)
            documentNumber = "0000 000000";
        else
            this.documentNumber = documentNumber;
    }

    @Override
    void customerInfo() {
        super.customerInfo("passport: " + documentNumber);
    }
}