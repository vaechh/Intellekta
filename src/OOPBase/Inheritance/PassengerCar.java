package OOPBase.Inheritance;

class PassengerCar extends Car{
    private int seats;

    public int getSeats() {
        return seats;
    }

    PassengerCar(int power, String model, int seats){
        super(power,model);
        this.seats = seats < 2 ? 5 : seats > 8 ? 5 : seats;

    }

    void printSpecification(){
        super.printSpecification();
        System.out.println("Seats count: " + this.seats);
    }
}
