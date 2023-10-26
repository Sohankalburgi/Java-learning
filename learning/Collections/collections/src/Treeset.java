import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);  // No duplicate of Treeset in the Collections
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        System.out.println("the duplicate is tried to added");
        ts.add(100);
        System.out.println(ts);

        System.out.println(ts.lower(50));
        System.out.println(ts.higher(50));
        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));

    }
}
