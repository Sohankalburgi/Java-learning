import java.util.*;
public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        // starts adding the element before or the first element of the queue
        // dq.addFirst(0);
        // dq.addFirst(1);
        // dq.addFirst(2);
        // dq.addFirst(3);
        // System.out.println(dq);

        dq.addLast(5);
        dq.addLast(6);
        dq.addLast(8);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
    }
}
