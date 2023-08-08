import java.util.*;
public class q1_decimaltobinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary = 0;
        
        while(n>0)
        {
            int rem = n%2;
            binary = (binary*10)+rem;
            n=n/2;
        }
        System.out.println(binary);
    }
}