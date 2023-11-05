package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class q3_detectduplicate {

    static boolean Checkduplicate(int []arr,int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])>2)
            {
                return true;
            }
        }
        return false;
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
        System.out.println(Checkduplicate(arr,n));
    }
}
