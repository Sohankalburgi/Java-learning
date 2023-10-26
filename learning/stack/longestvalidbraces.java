//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String s){
        // code here
        Stack<Character> stk = new Stack<>();
        int Maxlen = 0;
        int count =0;
        Stack<Integer> idx = new Stack<>();
        idx.push(-1);
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='(')
            {
                stk.push(s.charAt(i));
                idx.push(i);
            }
            
            else{ 
            if(stk.empty()==false && s.charAt(i)==')' && stk.peek()=='(')
            {
                stk.pop();
                idx.pop();
                count=i-idx.peek();
                Maxlen= Math.max(Maxlen,count);
                
            }
            else{
                stk.push(')');
                idx.push(i);
            }
            
            }
        }
        return Maxlen;
    }
}
