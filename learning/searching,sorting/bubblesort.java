import java.util.*;
//time complexity O(n^2)
//space complexity O(1)
public class bubblesort {

    static public void bubblesorting(int []a)
    {
        int n = a.length;
        
        for(int i=0;i<n;i++)
        {
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
                
            }
            if(swapped==false)
            {
                break;
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

        bubblesorting(a);
        System.out.println("the sorted array:");
        
        System.out.print(Arrays.toString(a));
        
    }
}
