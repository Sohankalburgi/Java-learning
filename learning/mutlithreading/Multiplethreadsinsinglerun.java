import java.util.*;
class calci extends Thread
{
    public void run()
    {
        String s=Thread.currentThread().getName();
        if(s.equals("cal"))
        {
            calc();
        }
        else{
            ImportantMessage();
        }
    }
    public void calc()
    {
        System.out.println("calculation is started");
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter the num1");
        int a =sc.nextInt();
        System.out.println("enter the num2");
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("ans :"+c);
        }
        catch(Exception o)
        {
            System.out.println(o.getMessage());
        }
        
        System.out.println("the calculation is completed");
        System.out.println("***********************************");
    }
    public void ImportantMessage()
    {
        try
        {
        System.out.println("DisplayImportant Message");
        for(int i=0;i<3;i++)
        {
            System.out.println("last submission date");
        }
        } 
        catch(Exception o)
        {
            System.out.println("some problem");
        }

        System.out.println("the message is done");
    }
}



public class Multiplethreadsinsinglerun {
    public static void main(String[] args) {
        System.out.println("main thread is started");
        calci thread1 = new calci();
        calci thread2 = new calci();
        thread1.setName("cal");
        thread2.setName("print");
        thread1.start();
        thread2.start();

        
    }
}
