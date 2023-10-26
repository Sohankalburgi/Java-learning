import java.io.*;
public class filewriter {
    public static void main(String[] args) throws IOException {
        File dir = new File("files");
        dir.mkdir();
 
        File text = new File(dir,"hello.txt");
        text.createNewFile();
        

        FileWriter content = new FileWriter(text,true); //  true in order to remove override
        content.write("hello");
        content.write(65);  
        content.write(97);
        char c[] = {'j','a','v','a'};
        content.write(c);
        
        //content.close();
        content.flush();

        

    }
}
