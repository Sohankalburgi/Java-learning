package exceptionHandling;
import java.util.*;
public class exceptionfirst
{
    public static void main(String args[])
    {
        int n=6;
        int m =0;
        int res=0;
        int values [] = {4,5,7,9};
        try
        {
         res = n/m; // critical statement
         System.out.println("try block");
         System.out.println(values[100]);
        }
        catch(ArithmeticException obj) // the class is taken where if the try gives objects
        {
           System.out.println("zero divsion error "+ obj );
        }
        catch(ArrayIndexOutOfBoundsException p)
        {
            System.out.println("the array are out of limits"+p);
        }
        System.out.println(res);
        System.out.println("bye");
    }
}