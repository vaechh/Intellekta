package OOPBase.Inheritance;

class Task{
    public void task(){
        PassengerCar passengerCar = new PassengerCar(300,"Model X", 5);
        passengerCar.printSpecification();

        Lorry lorry = new Lorry(620, "Semi", 6500);
        lorry.printSpecification();

        Motorcycle motorcycle = new Motorcycle(170,210);
        motorcycle.printSpecification();
    }
}
