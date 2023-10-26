import java.util.*;
class Hashtab {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("sohan",1);
        ht.put("kalburgi",2);
       // ht.put(null,null); // null is not allowed as it as hashmap
        ht.putIfAbsent("s",2);

        System.out.println(ht);

        System.out.println("tree map");
        TreeMap tm = new TreeMap();
        tm.put(1,"hi");
        tm.put(2,"hello");
        tm.put(3,"world"); // the keys are sorted
        tm.put(0,"light");
        System.out.println(tm);
        List a = new ArrayList();

    }
}
