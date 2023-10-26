import java.util.*;

class BasicofQueue
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        //to add the data element inside the queue
        for(int i=0;i<10;i++)
        {
            q.add(i);
        }
        System.out.println("Queue data looks like : "+ q);

        // the top most element in the queue
        System.out.println("the top most element in Queue before deleting :"+q.peek());

        // to remove the element in Queue
        q.remove();

        // the front element will be removed so to show the top most element changes 
        System.out.println("the top most element in Queue :"+q.peek());

        // to check the size of the element we use 
        System.out.println("the size of the Queue is :"+ q.size());



    }
}