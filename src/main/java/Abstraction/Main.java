package Abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Ujjain");

        IndigoAirlines indigoAirlines = new IndigoAirlines();
        indigoAirlines.fly();
        indigoAirlines.takeOff();
        indigoAirlines.planeColour();
        System.out.println("==============================");

        AirIndia airIndia = new AirIndia();
        airIndia.fly();
        airIndia.takeOff();
        airIndia.planeColour();


    }
}
