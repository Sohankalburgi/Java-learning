import java.util.HashMap;
import java.util.Map;

public class hashmapfunction
{
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        // put function
        hm.put(1,"Sohan");
        hm.put(2,"Pragathi");
        hm.put(3,"Eshwarasa");
        hm.put(4,"Gayathri");
        hm.put(5,"invalid name");
        // printing the hash map
        System.out.println("HashMap of the given data is :"+hm);

        // get function
        String s = hm.get(1);
        System.out.println("the great person in world is :"+s);

        // containsKey() function
        System.out.println(hm.containsKey(2));

        //remove() function
        hm.remove(5);
        System.out.println("updated hashmap:"+hm);
        
        // iteration using for loop entrySet()
        for(Map.Entry<Integer,String> e : hm.entrySet())
        {
            System.out.println("the hashmap is :"+e.getKey()+" : "+e.getValue());
        }
    }
}