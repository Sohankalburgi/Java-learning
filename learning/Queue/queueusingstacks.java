import java.util.*;
import java.lang.*;
public class queueusingstacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    
    // insertion of the data in queue
    // Time complexity : O(n)
    static void EnQueue(int data)
    {
        stack1.push(data);  
    }

    // Deleting the element in Queue - FIFO
    static int Dequeue()
    {
        int ele;
        if(stack1.empty() && stack2.empty())
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        
        // push all the elements in stack1;
        // Time complexity is O(n)
        if(stack2.empty())
        {
            while(!stack1.empty())
            {
                ele = stack1.pop();
                stack2.push(ele);
            }
        }
        //pop the stack2 peek element
        return stack2.pop();
        //here we get the -FIFO
    }



    public static void main(String[] args) {
    queueusingstacks q = new queueusingstacks();        
        q.EnQueue(1);
        q.EnQueue(2);
        q.EnQueue(3);
        q.EnQueue(4);
        q.EnQueue(5);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
    }
}
