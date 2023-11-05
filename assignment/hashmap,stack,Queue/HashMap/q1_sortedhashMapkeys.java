package HashMap;

import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class q1_sortedhashMapkeys
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // IF we need the Keys in specific order then we consider the TreeMap
        TreeMap<Integer,String> map = new TreeMap<>(/**Collections.reverseOrder()**/);
        System.out.println("Enter the Key and Value");
        for(int i=0;i<n;i++)
        {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(key, value);
        }

        System.out.println(map);
    }
}