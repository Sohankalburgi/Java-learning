import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean check = false;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=s.charAt(n-1-i))
            {
                check = true;
            }
        }
        if(check == false){
            System.out.println("IT's a palindrome String");
        }
        else{
            System.out.println("IT's not a palindrome String");
        }
    }
    
}
