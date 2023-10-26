class Demo1{
    protected int age ;
    void display(){
    System.out.println("display written in demo1");
    }
}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}

public class Multilevel {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        Demo2 d1 = new Demo2();
        d.display();
        
        d1.display();
    }
}
