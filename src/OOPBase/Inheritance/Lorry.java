package OOPBase.Inheritance;

class Lorry extends Car{
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    Lorry(int power, String model, int capacity){
        super(power,model);
        this.capacity = capacity < 500 ? 2500 : capacity > 10000 ? 2500 : capacity;
    }

    void printSpecification(){
        super.printSpecification();
        System.out.println("Capacity: " + this.capacity);
    }
}
