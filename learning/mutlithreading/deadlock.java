class Library implements Runnable
{
    String res1 = new String("Java");
    String res2 = new String("sql");
    String res3 = new String("DSA");
    @Override
    public void run()
    {
        String assign = Thread.currentThread().getName();
        if(assign.equals("Student1"))
        {
            try{
                Thread.sleep(3000);
                synchronized(res1)
                {
                System.out.println("Student1 has acquired"+res1);
                Thread.sleep(3000);
                synchronized(res2)
                {
                    System.out.println("student1 has acquired "+res2);
                    Thread.sleep(3000);
                    synchronized(res3)
                    {
                        System.out.println("student1 has acquired"+res3);
                        Thread.sleep(3000);
                    }
                }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }
        }
        else{
            try{
                Thread.sleep(3000);
                synchronized(res3)
                {
                System.out.println("Student2 has acquired"+res3);
                Thread.sleep(3000);
                synchronized(res2)
                {
                    System.out.println("student2 has acquired "+res2);
                    Thread.sleep(3000);
                    synchronized(res1)
                    {
                        System.out.println("student2 has acquired"+res1);
                        Thread.sleep(3000);
                    }
                }
                }
            }
            catch(Exception e)
            {
                System.out.println("some problem");
            }
        }
    }
}


public class deadlock {
    public static void main(String[] args) {
        Library lib = new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);
        t1.setName("Student1");
        t2.setName("Student2");
        t1.start();
        t2.start();
    }
}
