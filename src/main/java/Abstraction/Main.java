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

//        Program Output
/*
        Hello Ujjain
        Passenger Planes are flying at medium height
        Passenger Planes are taking off on huge runway
        Indigo Planes are white and blue coloured
        ==============================
        Passenger Planes are flying at medium height
        Passenger Planes are taking off on huge runway
        Air India Planes are white and red coloured
         */


    }
}
