import java.util.HashMap;

// TIME COMPLEXITY - O(N)
// SPACE COMPLEXITY - O(N)

public class NoofWays {

    // Memotization
    public static HashMap <Integer,Integer> map = new HashMap<>();
    public static int countWays(int n)
    {
        
        // your code here
        // base case
        if(n==1 || n==2)
        {
            return n;
        }
        
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        
        
        else{
            int Val = countWays(n-1)+countWays(n-2);
            map.put(n,Val%1000000007);
            return Val%1000000007;
        }
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(countWays(n));
        
    }
}
