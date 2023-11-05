package HashMap;

import java.util.*;

public class q2_sortedhashMapvalues {

    // public static HashMap<Integer,String> sortByvalue(HashMap<Integer,String> hm)
    // {
    //     // create the list from the element of HashMap
    //     List<Map.Entry<Integer,String>> list = new LinkedList<>(hm.entrySet());

    //     // sort the list
    //     Collections.sort(list, new Comparator<Map.Entry<Integer,String>>() {
    //         public int compare(Map.Entry<Integer,String> o1,Map.Entry<Integer,String> o2)
    //         {
    //             return (o1.getValue()).compareTo(o2.getValue());
    //         }
    //     });
    //     HashMap<Integer,String>temp = new HashMap<>();
    //     for(Map.Entry<Integer,String> i : list)
    //     {
    //         temp.put(i.getKey(),i.getValue());
    //     }       
    //     return temp;
    // }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // IF we need the Keys in specific order then we consider the TreeMap
        TreeMap<String,Integer> map = new TreeMap<>(/**Collections.reverseOrder()**/);
        System.out.println("Enter the Key and Value");
        for(int i=0;i<n;i++)
        {
            int key = sc.nextInt();
            String value = sc.next();
            map.put(value, key);
        }
        System.out.println(map);
        

        
    }
}
