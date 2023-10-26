class Human1{
    int age ;
    private String name; // private members are not inherited
    Human1()
    {
        System.out.println("Human class constructor");
    }
      void sleep()
    {
        age = 19;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }

}

class Student1 extends Human1
{
    // no student class constructor so default constructor is called
    //public Student1()
    //{
    //    super(); so the superclass of student1 is called ie Human1 class is called
    //}
    void disp()
    {
        System.out.println("age:"+age);
        //System.out.println("name:"+name);
    }
}

public class inheritenceconstructor {
    public static void main(String[] args)
    {
    Student1 st1 = new Student1();
    st1.sleep();
    st1.disp();
    }
}
