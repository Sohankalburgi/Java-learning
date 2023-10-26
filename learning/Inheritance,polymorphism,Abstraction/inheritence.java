

class Aeroplane
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

class Cargoplane extends Aeroplane
{
    public void fly()
    {
        System.out.println("Cargoplane is flying");
    }
    void Carry()
    {
        System.out.println("the plane is carrying goods");
    }
}

class PassengerPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("Passenger plane is takeoff");
    }
    public void carry()
    {
        System.out.println("passengers are carried");
    }
}
public class inheritence {

    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        cp.takeoff();
        cp.fly();
        cp.Carry();
        PassengerPlane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        
        
    }
    
}
