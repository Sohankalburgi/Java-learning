import java.util.Scanner;
class sumofdigits
{
    static int sumofdig(int n)
    {
        if(n==0)
        {
            return n;
        }
        return n%10+sumofdig(n/10);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the sum : "+sumofdig(n));
    }
}