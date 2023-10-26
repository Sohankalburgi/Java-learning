import java.util.*;
class calci implements Runnable
{
    public void run()
    {
        System.out.println("calculation is started");
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter the num1");
        Thread.sleep(3000);
        int a =sc.nextInt();
        System.out.println("enter the num2");
        Thread.sleep(3000);
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
}

class Message implements Runnable 
{
    public void run()
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


public class howtocreatethreadbyinterface {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        calci c1= new calci();
        Message m1 = new Message();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);
        
        t1.start();
        t2.start();
        
    }
}
