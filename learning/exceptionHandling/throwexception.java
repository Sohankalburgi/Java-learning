package exceptionHandling;
// custom expression and throw keyword
class MyException extends Exception // new custom exception
{
    public MyException()
    {

    }
    public MyException(String Msg)
    {
        super(Msg);
    }
}

public class throwexception {
    public static void main(String[] args) {
        
        int n1=8;
        int n2=-2;
        try{
        if(n2<0)
        {
            Exception e = new MyException("Negative number");
            throw e; // creating and throwing the exceptions
        }
        int result = n1/n2;
        System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println("enter the valid number" + e );
        }
    }
    
}
