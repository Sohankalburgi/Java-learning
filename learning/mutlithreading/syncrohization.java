class Car implements Runnable
{
    synchronized public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName()+"has entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"Got into the Car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"Started to drive the car");
            Thread.sleep(2000);

        }
        catch(Exception e)
        {
            System.out.println("some problem");
        }
    }
}

public class syncrohization {
    public static void main(String[] args) {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Son1");
        t2.setName("Son2");
        t3.setName("Son3");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
