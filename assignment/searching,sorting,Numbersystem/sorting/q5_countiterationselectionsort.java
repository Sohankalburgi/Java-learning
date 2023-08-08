package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q5_countiterationselectionsort {
    static public void selectionsorting(int []a)
    {
        int n = a.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int maxidx = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>a[maxidx])
                {
                    maxidx=j;
                }
                count++;
            }
            if(maxidx!=i)
            {
                int temp = a[i];
                a[i] = a[maxidx];
                a[maxidx] = temp;
                
            }
        }
        System.out.println(count);
        
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
