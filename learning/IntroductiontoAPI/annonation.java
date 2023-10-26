//functional interface
@FunctionalInterface
interface Demo
{
    void dis1();
    // void dis2();
}

@Deprecated
class Plane{
    public void fly()
    {
        System.out.println("plane is flying");
    }
}
class Cargoplane extends Plane
{
    //overidden method from parent class
    @Override
    public void fly()
    {
        System.out.println("plane flying at medium height");
    }
}


public class annonation {
    public static void main(String[] args) {
        // object of child class
        Plane cp = new Cargoplane();
        
        cp.fly();
        
    }
}
