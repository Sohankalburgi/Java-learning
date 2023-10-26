import java.io.*;
class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    public Cricketer (String name,int age,int runs)
    {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}
public class deserialization {
    public static void main(String[] args)throws Exception {
        

        FileInputStream fis = new FileInputStream("demo.txt");
        ObjectInputStream Ois = new ObjectInputStream(fis);
        Cricketer ck2 = (Cricketer) Ois.readObject();
        ck2.disp();
        Ois.close();
    }
}
