import java.util.Scanner;

public class reversingsentence {

    static String reverseword(int size,String s)
    {
        String a = new String ();
        for(int i=size;i>=0;i--)
        {
            a += s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        
        String sen = "think twice";
        String ans = new String ();
        int i=0;
        while(i<sen.length())
        {
            if(sen.charAt(i)==' ')
            {
                ans += reverseword(i-1, sen);
                break;
            }
            i++;
        }
        ans+=" ";
        ans+=reverseword(sen.substring(i+1).length(), sen.substring(i));


        System.out.println(ans);
    }    
}
