class A
{
    public void show()
    {
        System.out.println("in show");
    }
    class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        
        A.B obj1 = obj.new B();
        obj1.display();

    }
}
