import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class typesofhashMap {
    public static void main(String[] args) {
        
        // unordered output (It is not taking care of the insertion sequence)
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"Sohan");
        map.put(1,"pragathi");
        map.put(7,"gayathri");
        map.put(5,"Eshwarasa");
        System.out.println("Hashmap looks like:"+map);

        // ordered output(It maintains the order of insertion)
        LinkedHashMap <Integer,String> map1 = new LinkedHashMap<>();
        map1.put(3,"Sohan");
        map1.put(1,"pragathi");
        map1.put(7,"gayathri");
        map1.put(5,"Eshwarasa");
        System.out.println("Hashmap looks like:"+map1);

        //sorted data in terms of key
        TreeMap <Integer,String> map2 = new TreeMap<>();
        map2.put(3,"Sohan");
        map2.put(1,"pragathi");
        map2.put(7,"gayathri");
        map2.put(5,"Eshwarasa");
        System.out.println("Hashmap looks like:"+map2);

    }
}
