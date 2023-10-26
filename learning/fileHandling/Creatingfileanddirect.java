import java.io.*;
public class Creatingfileanddirect {
    public static void main(String[] args) throws IOException 
    {
        
        File f1 = new File("pw.txt");
        System.out.println(f1.exists());
        f1.createNewFile();
        System.out.println(f1.exists());

        File flo1 = new File("filehand");
        flo1.mkdir();
        System.out.println(flo1.exists());

    }
}
