package Inheritance;

public class CargoPlane extends Plane{

    @Override
    public void takeOff() {
        System.out.println("CargoPlane is taking off on huge runway");
    }

    @Override
    public void fly() {
        System.out.println("CargoPlane is flying slow");
    }
}
