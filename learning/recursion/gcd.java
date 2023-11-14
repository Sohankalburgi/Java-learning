import java.util.Scanner;

public class gcd {

    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        if(b==0)
        {
            return a;
        }
        if(a>b)
        {
            return gcd(b,a%b);
        }
        else{
            return gcd(b%a,a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("gcd is:"+gcd(A,B));
    }
}
