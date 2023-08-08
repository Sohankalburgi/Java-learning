package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q3_decreinsertionsort {
    static public void insertionsorting(int []a)
    {
        int n = a.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && a[j]>a[j-1])
            {
                //swap the elements
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
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

        insertionsorting(a);
        System.out.println("the sorted array:");
        
        System.out.print(Arrays.toString(a));
    }

}
