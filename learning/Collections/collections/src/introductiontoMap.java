import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class introductiontoMap {
    public static void main(String[] args) {

        Hashtable ht = new Hashtable();

        TreeMap tm = new TreeMap();

        // there is no order sequence in hashmap
        HashMap hm = new HashMap();
        hm.put(1,"sohan");
        hm.put("hello",12);
        hm.putAll(hm); // no duplication of key is allowed
        hm.put(2,"sohan");
        System.out.println(hm);
// ORDER OF INSERTION IS MAINTAINED
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(56,77);
        lhm.put(53,0);
        lhm.put("sohan",90);
        // lhm.clear(); the clear to remove all the keyvalue pairs
        System.out.println(lhm.get(56));
        System.out.println(lhm.keySet());
        System.out.println(lhm);
        System.out.println(lhm.values());
    }
}
