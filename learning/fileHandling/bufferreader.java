import java.io.*;
public class bufferreader {
    public static void main(String[] args) throws IOException{
        File dir = new File("files");
        File file = new File(dir,"hello.txt");
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }




    }
}
