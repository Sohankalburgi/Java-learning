import java.util.*;
public class selectionsort {
    //time complexity O(n^2)
    // space complexity O(1)
    static public void selectionsorting(int []a)
    {
        int n = a.length;
        for(int i=0;i<1;i++)
        {
            int minidx = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[minidx])
                {
                    minidx=j; // this gonna updating itself
                }
            }
            if(minidx!=i)
            {
                int temp = a[i];
                a[i] = a[minidx];
                a[minidx] = temp;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n = sc.nextInt();
        
        int []a= new int[n];
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }  

        selectionsorting(a);
        System.out.println("the sorted array:");
        
        System.out.print(Arrays.toString(a));
    }
}
