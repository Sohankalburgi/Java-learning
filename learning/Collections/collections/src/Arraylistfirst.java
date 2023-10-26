import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Arraylistfirst {
    public static void main(String[] args) {
        ArrayList a = new ArrayList(); //  homogeneous and heterogeneous
        a.add(3);
        a.add(5);
        a.add(7);
        System.out.println(a);

        ArrayList b = new ArrayList();
        b.add("HI");
        b.add(7);
        b.add('&');
        b.add(5.73);
        System.out.println(b);
        b.add(10.56);
        System.out.println(b);

        ArrayList c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c); // addall collection used to concatenate
        c.addAll(b);
        System.out.println(c);
        System.out.println(c.get(0));

        ArrayList d = new ArrayList();
        d.add(123);
        d.add(d); // 123,(this Collection)
        d.addAll(d);
        System.out.println(d);

    }
}
