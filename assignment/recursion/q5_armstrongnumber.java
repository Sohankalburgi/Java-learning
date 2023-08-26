import java.util.Scanner;

public class q5_armstrongnumber {

    static int armstrong(int n,int len)
    {
        if(n<=0)
        {
            return 0;
        }
        return (int)Math.pow(n%10,3)+armstrong(n/10, len);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len=0;
        int temp = n;
        while(n>0)
        {
            n=n/10;
            len++;
        }
        if(armstrong(temp,len)==temp)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
