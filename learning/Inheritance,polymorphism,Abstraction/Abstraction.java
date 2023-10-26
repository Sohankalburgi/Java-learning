abstract class AeroPlane2
{
    // abstract cannot be used for variable and constructor
    abstract public void takeoff();
    abstract public void fly();
    public void landing()
    {
        System.out.println("aeroplane is landing");
    }
}

class CargoPlane2 extends AeroPlane2
{
    public void takeoff()
    {
        System.out.println("CargoPlane requires a longer runway");
    }

    public void fly()
    {
        System.out.println("CargoPlane flies at lowest height");
    }

    public void alert()
    {
        System.out.println("ALert...");
    }
}

class PassengerPlane2 extends AeroPlane2
{
    public void takeoff()
    {
        System.out.println("PassengerPlane requires a longer runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}

class FighterPlane2 extends AeroPlane2
{
    public void takeoff()
    {
        System.out.println("FighterPlane requires smaller runeay");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies at maximum height");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        AeroPlane2 ref1 = new CargoPlane2();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();
        // ref1.alert(); // the specialization method cannot be called by the parent 
        ((CargoPlane2) ref1).alert(); // hence we use casting

        AeroPlane2 ref2 = new PassengerPlane2();
        ref2.takeoff();
        ref2.fly();
        ref2.landing();
    }
    
}
