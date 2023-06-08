import java.util.Scanner;

class reversingString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println("the String before reversing : "+a );
        String reverse = new String ();
        for(int i=a.length()-1;i>=0;i--)
        {
            reverse += a.charAt(i); 
        }
        System.out.println("the String after reversing : "+reverse);

    }
}