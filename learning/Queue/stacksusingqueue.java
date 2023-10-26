import java.util.*;
public class stacksusingqueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // to add the new element in stack
    static void add(int data)
    {
        // Move all elements from q1 to q2
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        //2. insertion of new element
        q1.add(data);

        //3. move back all the elements from q2 to q1
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    // to delete the element from the stack
    static int remove()
    {
        if(q1.isEmpty())
        {
            System.out.println("Stack is underflow");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        stacksusingqueue s = new stacksusingqueue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println(s.remove());
    }
}
