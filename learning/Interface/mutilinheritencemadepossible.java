interface A
{
    void show();
}
interface B
{
    void abc();
}

class X implements A,B
{
    public void show()
    {
        System.out.println("hello");
    }
    public void abc()
    {
        System.out.println("abc world");
    }
}

public class mutilinheritencemadepossible {
    public static void main(String[] args) {

        X obj = new X();
        obj.show();
        obj.abc();
        
    }
}
