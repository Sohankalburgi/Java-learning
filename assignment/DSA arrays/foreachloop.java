import java.util.*;
public class foreachloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();    
        }
        for(int i:a)
        {
            if(i%2==0)
            System.out.print(i+" ");
        }
    }
}
