package HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class q4_treeMapusedMajorityelement {

    static int majorityelement(int []arr,int n)
    {
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],1);
        }
        return map.firstKey();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityelement(arr,n));
    }
}
