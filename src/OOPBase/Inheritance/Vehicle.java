package OOPBase.Inheritance;

class Vehicle{
    private int power;

    public int getPower() {
        return power;
    }

    Vehicle(int power){
        this.power = power < 1 ? 1 : power > 3000 ? 1 : power;
    }

    void printSpecification(){
        System.out.println("Vehicle power: " + this.power);
    }
}