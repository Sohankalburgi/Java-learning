package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q4_countpassbubblesort {
    static public void bubblesorting(int []a)
    {
        int n = a.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                    
                }
                
                count++;
            }
            if(swapped==false)
            {
                break;
            }
        }
        System.out.println("the number of passes : "+count);
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
