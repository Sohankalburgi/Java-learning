import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class q3_operationstodooncharacters {

    static int sum(ArrayList<String> list)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).equals("C"))
            {
                stack.pop();
            }
            else if(list.get(i).equals("D"))
            {
                int ele = stack.peek(); 
                stack.push(ele*2);
            }
            else if(list.get(i).equals("+"))
            {
                int x = stack.pop();
                int ele = x+stack.peek();
                stack.push(x);
                stack.push(ele);
            }
            else{
                stack.push(Integer.parseInt(list.get(i)));
            }
        }
        int sum = 0;
        while(!stack.isEmpty())
        {
            sum+=stack.pop();
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        } 
        System.out.println("the sum is :"+ sum(list));
    }
}