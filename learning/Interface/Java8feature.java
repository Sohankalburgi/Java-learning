interface A
{
    void show();
    default void config()
    {
        System.out.println("in config"); // default method in interface A
    }

    static void abc()
    {
        System.out.println("in abc"); // static method in interface A
    }

}

class B implements A
{
    public void show()
    {
        System.out.println("the show is inherted interface");
    }
}


public class Java8feature {
    public static void main(String[] args) {
        A.abc(); // static method is called
        A o = new B();
        o.show();        

    }
}
