package OOPBase.Inheritance;

final class Motorcycle extends Vehicle{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    Motorcycle(int power, int speed){
        super(power);
        this.speed = speed < 0 ? 200 : speed > 300 ? 200 : speed;
    }

    void printSpecification() {
        super.printSpecification();
        System.out.println("Moto speed: " + this.speed);
    }
}
