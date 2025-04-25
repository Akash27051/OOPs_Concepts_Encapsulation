package Abstraction;

public abstract class PassengerPlane extends Plane{
    @Override
    public void takeOff() {
        System.out.println("Passenger Planes are taking off on huge runway");
    }

    @Override
    public void fly() {
        System.out.println("Passenger Planes are flying at medium height");

    }

    public abstract void planeColour();
}
