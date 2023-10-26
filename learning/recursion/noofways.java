import java.util.Scanner;
public class noofways {

    static int countno(int n)
    {
        int result = 0;
        if(n<=1)
        return n;
        else{
            result = countno(n-1)+countno(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int n = sc.nextInt();
        sc.close();
        int result = countno(n+1);
        System.out.println("no of ways :"+result);

    }
}
