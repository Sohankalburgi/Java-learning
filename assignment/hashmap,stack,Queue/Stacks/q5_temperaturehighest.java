import java.io.*;
import java.util.*;
import java.util.Stack; 

class temperature {
   public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int []nge = new int [n]; 
        
        Stack<Integer>st = new Stack();
        
		// move from right to left
        for(int i = n-1; i>=0; --i){
            // pop until we find next greater element to the right
			// since we came from right stack will have element from right only
			// s.top() is the index of elements so we put that index inside temperatures vector to check
            while(!st.empty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            // if stack not empty, then we have some next greater element, 
			// so we take distance between next greater and current temperature
			// as we are storing indexes in the stack
            if(!st.empty()){
                nge[i] = st.peek()-i; // distance between next greater and current
            }
			// push the index of current temperature in the stack,
			// same as pushing current temperature in stack
            st.push(i);
        }
        return nge;
    }
	public static void main(String[] args){
        int []a = {73,74,75,71,69,72,76,73};
        System.out.println("The desired output is : ");
        
        int []arr = dailyTemperatures(a);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
	}
}
