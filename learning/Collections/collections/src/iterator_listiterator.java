import java.util.ArrayList;
import java.util.Iterator;
import  java.util.*;

public class iterator_listiterator {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        for(int i=0;i<3;i++)
        {
            a.add(i);
        }
        System.out.println(a);

//        for(int j=0;j<a.size();j++)
//        {
//            System.out.println(a.get(j));
//        }
//        System.out.println("the for loop case");
//        // for each loop
//        for(Object j:a)
//        {
//            System.out.println(j);
//        }
        Iterator itr = a.iterator();

        while(itr.hasNext())
        {
            //Integer i =(Integer) itr.next();
            System.out.println(itr.next());
        }
        ListIterator itr1 = a.listIterator(a.size());
        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }

    }
}
