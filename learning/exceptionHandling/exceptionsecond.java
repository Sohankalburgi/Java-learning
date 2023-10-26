package exceptionHandling;
import java.util.*;
public class exceptionsecond {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n=0;
        // try{
        //  n = sc.nextInt();
        // }
        // catch(InputMismatchException er)
        // {
        //     System.out.println("Enter the integer");
        // }
        // finally
        // {
        //     sc.close();
        // }
        int n =0;
        //new try and resource
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextInt();
        }
        catch(InputMismatchException er)
        {
            System.out.println("enter the number");
        }
        System.out.println(n);
        
    }
    
}
