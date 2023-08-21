package OOPBase.Inheritance;

class Car extends Vehicle{
    private String model;

    public String getModel() {
        return model;
    }

    Car(int power, String model){
        super(power);
        this.model = model == null ? "default" : model;
    }

    void printSpecification(){
        super.printSpecification();
        System.out.println("Car model: " + this.model);
    }
}