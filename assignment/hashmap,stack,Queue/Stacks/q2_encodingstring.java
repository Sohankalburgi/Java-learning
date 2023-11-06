import java.util.*;

public class q2_encodingstring {

    public static String encoding(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch!=']')
            {
                // this is to push all the characters in stack except the ']'
                stack.push(ch);
            }
            else{
                StringBuilder sb = new StringBuilder();
                // sb string builder to store the characters and then pushed to the stack
                while(!stack.isEmpty() && stack.peek()!='[')
                {
                    sb.append(stack.pop());
                }
                // the pop is done to remove the '[' peek character from stack
                stack.pop();
                int k=0;
                int base =1;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = (stack.pop() - '0') * base + k;
                    base *= 10;
                }
                StringBuilder ad = new StringBuilder();
                System.out.println(k);
                while(k-- > 0){
                    for(int i=sb.length()-1; i>=0; i--){
                        stack.push(sb.charAt(i));
                    }
                }
            }
        }
        char []ans = new char[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
        {
            ans[i] = stack.pop();
        }

        return new String(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        //System.out.println('2' -'0'); ans is 2
        System.out.println("the encoded String :"+ encoding(s));
    }
}