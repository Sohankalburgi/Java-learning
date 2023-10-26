class Printing implements Runnable
{
    public void run()
    {
        try{
            for(int i=0;i<2;i++)
            {
                System.out.println("focus is important");
                Thread.sleep(3000);
            }
        }
        catch(Exception i){
            System.out.println("some problem");
        }
    }
}
public class joinandisalive {
    public static void main(String[] args) throws Exception {
        System.out.println("main thread started");
        Printing p = new Printing();
        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive()); // this happens false as the thread is not passed by start() method yet
        t1.start();
        System.out.println(t1.isAlive()); // this happens to be true it happens to be started or activated by start method
        t1.join(); // until t1 joins next will not be performed.
        System.out.println("Main thread finished the work");
        
    }
}
