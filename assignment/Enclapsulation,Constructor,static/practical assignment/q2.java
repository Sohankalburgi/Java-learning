//2.Write a program and create a constructor with parameters and initialise the variable using
//a constructor.
import java.util.Scanner;

class student {
    private int age ;
    private String name;

    student(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    void display()
    {
        System.out.println("age:"+this.age);
        System.out.println("name:"+this.name);
    }
}

class q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();

        student s = new student(age, name);
        s.display();        
    }
}
