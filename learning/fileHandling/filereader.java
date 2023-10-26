import java.io.*;
public class filereader {
    public static void main(String[] args) throws IOException {
        
        File dir = new File("files");

        File file = new File(dir,"hello.txt");

        FileReader fd = new FileReader(file);

        char c[] = new char[(int)file.length()];
        fd.read(c);
        for(char i:c)
        {
            System.out.print(i);
        }
        

        // int i = fd.read();
        // while(i!=-1)
        // {
        //     System.out.println((char) (i));
        //     i=fd.read();
        // }
        

    }
    
}
