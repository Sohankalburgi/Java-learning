import java.util.Scanner;

public class bs {

    static int binarysearch(int []a,int low,int high,int x)
    {
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            else if(a[mid]>x)
            {
                return binarysearch(a, low,mid-1, x);
            }
            else{
                return binarysearch(a, mid+1, high, x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []a = {2,4,6,10,15,27,34,39,45,56};
        int ans = binarysearch(a,0,a.length-1,34);
        System.out.println(ans);
        
        
    }
}
