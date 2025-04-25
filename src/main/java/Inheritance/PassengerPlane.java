package Inheritance;

public class PassengerPlane extends Plane{
    @Override
    public void takeOff() {
        System.out.println("Passenger Plane is taking off on medium size runway");
    }

    @Override
    public void fly() {
        System.out.println("Passenger Plane is flying at medium speed");
    }
}
