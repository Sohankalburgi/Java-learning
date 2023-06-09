import java.util.*;

public class sortingstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] a = s.toCharArray();
        Arrays.sort(a);
        String ans ="";
        for(int i=0;i<a.length;i++)
        {
            ans+=a[i];
        }
        System.out.println(ans);
    }
    
}
