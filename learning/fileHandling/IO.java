import java.util.*;
class student
{
    private String name;
    private int age;
    private String city;

    public student (String name,int age,String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString()
    {
        return name+"-"+age+"-"+city;
    }

}

public class IO
{
    public static void main(String[] args) {
        student st1 = new student("Sohan",19,"Bangalore");
        System.out.println(st1);
        student st2 = new student("Pragathi", 17, "bengaluru");
        System.out.println(st2);

    }
}