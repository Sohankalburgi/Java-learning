interface A
{
    int num = 5;
    void print();
    
}

class B implements A
{
    public void print()
    {
        System.out.println("the print statement is executed");
    }
}

public class basicinterface
{
    public static void main(String[] args) {
        System.out.println(A.num);
        B s = new B();
        s.print();

        A p = new B(); // datatype
        p.print();
    }
}