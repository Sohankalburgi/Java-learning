import java.util.*;
import java.util.stream.*;
public class Streamapi
{
    public static void main(String[] args) {
        
        List <Integer> list = Arrays.asList(2,4,5,6,7,8,3);
        list.forEach(i -> System.out.println(i));
        System.out.println("stream work");
        Stream <Integer> streamData = list.stream();
        // once when created the stream and worked once it is done it 
        //shows illegal state.
        
        //streamData.forEach(  i -> System.out.println(i));
        // long n =streamData.count();
        // System.out.println(n);

        // Stream sor = streamData.sorted();
        // sor.forEach(i -> System.out.println(i));

        // Stream <Integer> mapstream = streamData.map(n -> n*2);
        // mapstream.forEach(i -> System.out.println(i));

        Stream <Integer> filData =  streamData.filter(n -> n%2==0);
        Stream <Integer> sortedstream = filData.sorted();
        Stream <Integer> mapstream = sortedstream.map(n->n*2);
        
        mapstream.forEach(i->System.out.println(i));

    }
}