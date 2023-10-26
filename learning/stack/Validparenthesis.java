import java.util.Scanner;
import java.util.Stack;

public class Validparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parenthesis string");
        String s = sc.nextLine();
        int flag =1;
        Stack<Character> frame = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                frame.push(s.charAt(i));
            }
            if(frame.isEmpty())
            {
                flag=0;
                break;
            }
            
            
                else if(frame.peek()=='(' && s.charAt(i)==')')
                {
                    frame.pop();
                }
                else if(frame.peek()=='{' && s.charAt(i)=='}')
                {
                    frame.pop();
                }
                else if(frame.peek()=='[' && s.charAt(i)==']')
                {
                    frame.pop();
                }
                
            
        }
        if(frame.isEmpty() && flag==1)
        {
            System.out.println("Valid parenthesis");
        }
        else{
            System.out.println("invalid parenthesis");
        }

    }
}
