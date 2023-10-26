import java.io.*;
public class printwriter {
    public static void main(String[] args) throws IOException {
        File dir = new File("files");
        
        File file = new File(dir,"hello.txt");

        FileWriter fw = new FileWriter(file);
        
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97); //  print the ascii character
        pw.write("\n");
        pw.println("java"); // print the java
        pw.println(100); // print only the integer 100
        pw.println(100.5);
        pw.println(true);
        pw.close();



    }
}
