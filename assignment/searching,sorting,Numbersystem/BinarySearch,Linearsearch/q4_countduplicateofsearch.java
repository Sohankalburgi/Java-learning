import java.util.Scanner;

public class q4_countduplicateofsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();

        int a[] =new int [n]; 
        System.out.println("enter the search element:");
        int k = sc.nextInt();
        System.out.println("enter the array elements");
        for(int i=0;i<n;i+=1)
        {
            a[i] = sc.nextInt();
        }

        int low =0;
        int result =-1;
        int high = n-1;
        int count=0;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(a[mid]==k)
            {
                result = mid;
                high = mid-1;
                count++;
            }
            else if(a[mid]>k)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        int count1=0;
        for(int i=result;i<n;i++)
        {
            if(a[i]!=k)
            {
                break;
            }
            count1++;
        }
        System.out.println("the ans : "+count1);
    }
}
