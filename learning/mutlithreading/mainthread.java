public class mainthread
{
    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println("before changing :");
        String name =Thread.currentThread().getName();
        System.out.println("the name of main thread :"+name);
        System.out.println("the priorty of main thread :"+Thread.currentThread().getPriority());
        System.out.println("after changing :");
        Thread t=Thread.currentThread();
        t.setName("sohan");
        System.out.println("the name of main thread :"+Thread.currentThread().getName());
        t.setPriority(4);
        System.out.println("the priority :"+t.getPriority());
    }
}