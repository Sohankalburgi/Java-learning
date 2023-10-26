import java.util.Scanner;

public class powerofnum {

    static int pow(int a,int b)
    {
        if(b==1)
        {
            return a;
        }
        else
        {
            int result = pow(a,b/2);
            int finalres = result*result;
            if(b%2==0)
            {
                return finalres;
            }
            else
            {
                return finalres*a;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
}
