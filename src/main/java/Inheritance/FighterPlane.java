package Inheritance;

public class FighterPlane extends Plane{
    @Override
    public void takeOff() {
        System.out.println("Fighter Plane is taking off on short size runway");
    }

    @Override
    public void fly() {
        System.out.println("Fighter Plane is flying very fast");
    }
}
