import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Hashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(20); // it is not on order as mentioned
        hs.add(30);
        hs.add(40);
        System.out.println(hs);
        hs.add(30); // duplicate element can't be added
        System.out.println(hs);

        // to get the order as mentioned
        System.out.println("LINKED HASH SET");
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100); //  to preserve the sequential insertion
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);

        System.out.println(lhs);
    }
}
