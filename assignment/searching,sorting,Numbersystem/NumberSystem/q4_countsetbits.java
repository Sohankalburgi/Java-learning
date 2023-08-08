import java.util.Scanner;

public class q4_countsetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary = 0;
        int count =0;
        while(n>0)
        {
            int rem = n%2;
            if(rem==1)
            {
                count++;
            }
            binary = (binary*10)+rem;
            n=n/2;
        }
        System.out.println(count);
    }
}
