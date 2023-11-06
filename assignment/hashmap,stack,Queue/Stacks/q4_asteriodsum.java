import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class q4_asteriodsum {
    public static ArrayList<Integer> listofasteriod(int []arr,int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            stack.push(arr[i]);
        }
        while(!stack.isEmpty())
        {
            int x = stack.pop();
            int y = stack.pop();
            if(Math.abs(x)!=Math.abs(y) && (x>0 && y<0) || (x<0 && y>0))
            {
               if(Math.abs(x)>Math.abs(y)){ 
                if(stack.isEmpty())
                    {stack.push(x);
                    break;}
                else{
                    stack.push(x);
                }
               }
               else{
                if(stack.isEmpty())
                {
                stack.push(y);
                break;
                }
                else{
                    stack.push(y);
                }
               }
            }
            else if(Math.abs(x)!=Math.abs(y) && (x>0 && y>0) || (x<0 && y<0))
            {
                if(stack.isEmpty())
                {
                    stack.push(x);
                    stack.push(y);
                    break;
                }
                
            }
        }
        while(!stack.isEmpty())
        {
            ans.add(stack.pop());
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("the result is :"+ listofasteriod(arr,n));
    }
}
