import java.util.Scanner;

public class q3_countbinary {

    static public int result(int []a)
    {
        int n = a.length;
        int low =0;
        int ans = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low +(high -low)/2;
            if(a[mid]==1)
            {
                ans = mid;
                high = mid-1;
            }
            else if(a[mid]<1)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return n-ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();

        int a[] =new int [n]; 
        
        System.out.println("enter the array elements");
        for(int i=0;i<n;i+=1)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("the no of 1's :"+result(a));
        
    }
}
