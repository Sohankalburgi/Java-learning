import java.util.Scanner;

class reverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = new String ();
        for(int i=s.length()-1;i>=0;i--)
        {
            a += s.charAt(i);
        }
        System.out.println(a);
    }
}