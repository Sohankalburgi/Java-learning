import java.util.*;

class Student
{
    String name;
    int marks;
    int age;
    public Student(String name, int age,int marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getAge()
    {
        return age;
    }

    public int getMarks()
    {
        return marks;
    }

    public String getName()
    {
        return name;
    }

    public String toString() //  we have overwritten the toString method of objet class.
    {
        return ""+marks+"-"+age+"-"+name;
    }
}
//Comparator interface is implemented in alpha class.
// Comparator interface is functional interface which has only one abstract method compare()
// method
// this is by class method
// class Alpha implements Comparator <Student>  
// {
//     public int compare(Student a,Student b)
//     {
//         if(a.age>b.age)
//         return 1;
//         else
//         return -1;
//     }
// }

public class Comparators {
    public static void main(String[] args) {
        Student st1 = new Student("Sohan", 19, 100);
        Student st2 = new Student("Pragathi", 17, 98);
        Student st3 = new Student("Unknown", 10, 70);

        List <Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);

        //Collections.sort(list);
        //Alpha a = new Alpha();
        //Collections.sort(list,a);

        //by lambda expression.
        Comparator <Student> com = (Student a,Student b) -> {
            if(a.marks>b.marks)
            return 1;
            else
            return -1;
        };

        Collections.sort(list,com);
        System.out.println(list);

    }
    
}
