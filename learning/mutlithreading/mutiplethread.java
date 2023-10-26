import java.util.Scanner;

class calci extends Thread
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
class Message extends Thread 
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

public class mutiplethread {
    public static void main(String[] args) {
        

        System.out.println("Main thread started");
        calci t1= new calci();
        Message t2 = new Message();
        t1.setPriority(10);
        t1.start();
        
        t2.start();
        
        

        
    }
}
