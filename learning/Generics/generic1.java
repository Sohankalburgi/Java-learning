import java.util.*;
class Gen <T>
{
    T obj;
    public Gen(T obj)
    {
        this.obj=obj;
    }

    public T getobj()
    {
        return obj;
    }

    void display()
    {
        System.out.println("the type of data is"+ obj.getClass().getName());
    }
}


public class generic1 {
    public static void main(String[] args) {
        
        Gen<Integer> g = new Gen<Integer>(10);
        g.display();
        System.out.println(g.getobj());

        ArrayList<Gen> create = new ArrayList<Gen>();

        ArrayList <String> al1 = new ArrayList<String>();

        List <String> al2 = new ArrayList<String>();

        Collection <Integer> al3 = new ArrayList<Integer>();
        
        List <Object> al4 = new ArrayList<Object>();

        // List<Object> al5 = new ArrayList<Integer>(); compilation error
        
    }
}
