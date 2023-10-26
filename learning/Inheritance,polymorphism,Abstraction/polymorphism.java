class AeroPlane2
{
    public void takeoff()
    {
        System.out.println("AeroPlane is taking off");
    }

    public void fly()
    {
        System.out.println("Aeroplane is flying");
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

class Airport
{
    public void poly(AeroPlane2 ref)
    {
        ref.takeoff();
        ref.fly();

        System.out.println("-------------------------------");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        CargoPlane2 cp = new CargoPlane2();
        PassengerPlane2 pp = new PassengerPlane2();
        FighterPlane2 fp = new FighterPlane2();

        // cp.takeoff();
        // cp.fly();

        // pp.takeoff();
        // pp.fly();

        // fp.takeoff();
        // fp.fly();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
