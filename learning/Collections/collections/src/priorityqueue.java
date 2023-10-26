import java.util.PriorityQueue;
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);  // the data is stored in priority
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
        PriorityQueue a = new PriorityQueue();
        System.out.println(a);
    }
}
