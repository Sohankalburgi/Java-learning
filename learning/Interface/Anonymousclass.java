interface Car{
    void drive();

}
// class wagnor implements Car
// {
//     public void drive()
//     {
//         System.out.println("driving....");
//     }
// }



public class Anonymousclass
{
    public static void main(String[] args) 
    {
        Car obj = new Car()   /// using the interface 
        {
            public void drive()
            {
                System.out.println("driving...");
            }
        };
        obj.drive();
    
    }
}