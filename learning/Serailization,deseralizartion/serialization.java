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
}
public class serialization
{
    public static void main(String[] args) throws Exception{
        Cricketer ck = new Cricketer("MSdhoni", 47, 100);
        FileOutputStream fos = new FileOutputStream("demo.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(ck);

        oos.flush();
        oos.close();


    }
}