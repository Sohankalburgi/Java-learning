import java.io.*;


public class bufferwriter {
    public static void main(String[] args) throws IOException {
        
        File dir = new File("files");
        File file = new File(dir,"hello.txt");

        FileWriter fw =new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char [] c = {'h','e','l','l','o'};
        bw.write(c);
        bw.flush();
        bw.close();



        

    }
}
