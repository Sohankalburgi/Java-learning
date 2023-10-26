//@FunctionalInterface
interface Car
{
    void drive();

}
public class lambda // lambda expression works for one function
{
    public static void main(String[] args) 
    {
        Car obj = () -> System.out.println("driving..."); // lambda exp
        obj.drive();
    
    }
}