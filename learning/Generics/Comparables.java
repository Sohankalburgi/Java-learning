import java.util.*;
class Student implements Comparable<Student>
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

    public int compareTo (Student a)
    {
        if (this.age > a.age)
        return 1;
        else
        return -1;
    }
}

public class Comparables{
    public static void main(String[] args) {
        Student st1 = new Student("Sohan", 19, 100);
        Student st2 = new Student("Pragathi", 17, 98);
        Student st3 = new Student("Unknown", 10, 70);

        List <Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println(list);
        Collections.sort(list);


    }
}