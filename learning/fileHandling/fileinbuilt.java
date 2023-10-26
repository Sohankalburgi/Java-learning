import java.io.*;
public class fileinbuilt {
    public static void main(String[] args) throws IOException{
        File dir = new File ("Javafile");
        System.out.println(dir.isDirectory());
        dir.mkdir();

        File file = new File(dir,"1stfile.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());

        
        File f1 = new File("Javafile");
        String s[] = f1.list();
        
        System.out.println(s.length);
        for(int i:s)
        {
            System.out.println(i);
        }
        
    }
}
