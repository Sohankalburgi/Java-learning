class Mythread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("the child thread");
    }
}



class howtocreatethreadbyextendingthreadclass {
    public static void main(String[] args) {
        // by extending thread class
        Mythread t = new Mythread();
        t.start();// if we call start() method then it is multithreading
        t.run();// if we call run() method then it is single thread
        
        
    }
}
