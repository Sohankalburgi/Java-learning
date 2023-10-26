import java.util.Stack;

public class StackImplementation
{
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        
        // adding the element is stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        stack1.push(10);
        stack1.push(10);
        stack1.push(10);
        stack1.push(10);
        stack1.push(10);
        stack1.push(10);
        stack1.push(12);
        System.out.println("The stack is :" + stack1);
    
        // to return the topmost element in the stack
        System.out.println("The Topmost element: "+stack1.peek());

        // Deletion of the stack topmost element
        stack1.pop();
        System.out.println("the Stack now is: "+stack1);

        // to search element in the stack 
        System.out.println("Element 4 is present at the position: "+ stack1.search(4));

        // to check whether stack is empty or not 
        // it returns boolean value (True/False)
        System.out.println("the Stack empty or not: "+stack1.isEmpty());

        // to get the capacity of the stack
        System.out.println("The capacity of the stack is: "+stack1.capacity());
        // inital capacity is 10 if more than 10 element is pushed then it becomes 20
        
    }
}