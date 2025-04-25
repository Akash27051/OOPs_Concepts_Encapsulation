package Inheritance;

public class Main
{
    public static void main(String [] arg)
    {
        System.out.println("Hello Akash");

        Airport airport = new Airport();
        // Passing PassengerPlane Object
        airport.permit(new PassengerPlane());
        System.out.println("=================================");

        // Passing CargoPlane Object
        airport.permit(new CargoPlane());
        System.out.println("=================================");

        // Passing FighterPlane Object
        airport.permit(new FighterPlane());
        System.out.println("=================================");

//        Output of Program
//        Hello Akash
//        Passenger Plane is taking off on medium size runway
//        Passenger Plane is flying at medium speed
//        ==================================
//        CargoPlane is taking off on huge runway
//        CargoPlane is flying slow
//        =================================
//        Fighter Plane is taking off on short size runway
//        Fighter Plane is flying very fast




    }
}
