import java.util.*;
import java.util.Arrays;
import java.util.function.Consumer;
public class foreachmethod {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList();
        list1.add(100);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(7);
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(1,2,3,5,5);
        System.out.println(list2);

        for(Integer i : list2)
        {
            System.out.println(i);
        }

        for(Object i :list1)
        {
            System.out.println(i);
        }

        System.out.println("By using functional interface");
        list2.forEach(n -> System.out.println(n));

        // Consumer<Integer> cons = new Consumer<Integer>() 
        // {
        //     @Override
        //     public void accept(Integer i)
        //     {
        //         System.out.println(i);
        //     }
        // };

        Consumer <Integer> cons = (Integer i) ->System.out.println(i);
        System.out.println("Using the consumer interface");
        list2.forEach(cons);
    }
    
}
