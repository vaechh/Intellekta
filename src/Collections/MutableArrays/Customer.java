package Collections.MutableArrays;

abstract class Customer {
    private int purchaseCount;

    public double getPurchaseCount() {
        return purchaseCount;
    }

    protected void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount > 0 ? purchaseCount : 0;

        if (this.purchaseCount < 5)
            discountSize = 0;
        else if (this.purchaseCount < 10)
            discountSize = 0.05;
        else if (this.purchaseCount < 15)
            discountSize = 0.1;
        else
            discountSize = 0.2;
    }

    private double discountSize;

    public double getDiscountSize() {
        return discountSize;
    }

    private String name;

    public String getName() {
        return name;
    }

    Customer(int purchaseCount, String name) {
        setPurchaseCount(purchaseCount);

        if (name == null || name.isBlank() || name.isEmpty())
            this.name = "No-name";
        else
            this.name = name;
    }

    public void customerInfo(String appendInfo){
        StringBuilder sb = new StringBuilder();

        sb.append("Customer ").append(this.getName()).append("(").append(appendInfo).
                append(") has a discount ").append(getDiscountSize()).append("% ").append(TechArrays.NEW_LINE);

        System.out.println(sb.toString());
    };
    abstract void customerInfo();
}