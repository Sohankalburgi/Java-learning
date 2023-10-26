import java.util.*;

public class fibonaciiDP
{
    // ONLY RECURSION METHOD
    // TIME COMPLEXITY - O(2^N)
    //  SPACE COMPLEXITY - O(LOG N) TO O(N)

    // BY DYNAMIC PROGRAMMING
    // TIME COMPLEXITY - O(N)
    // SPACE COMPLEXITY - O(N) == HASHMAP

    public static Map <Integer,Long> memo = new HashMap<>();


    public static int fibo(int n)
    {
        // base case
        if(n<=1)
            return 1;

        // recursive call
        return fibo(n-1)+fibo(n-2);
    }

    public static long fibomemo(int n)
    {
        // BASE CASE
        if(n<=1)
        {
            return 1;
        }
        // OPTIMISED LOGIC - TO AVOID RECOMPUTATION OF ALGORITHM
        if(memo.containsKey(n))
        {
            return memo.get(n);
        }

        long fiboVal = fibomemo(n-1)+fibomemo(n-2);
        memo.put(n,fiboVal);
        return fiboVal;
    }

    // TABULAR DP METHOD
    // TIME COMPLEXITY O(N)
    // SPACE COMPLEXITY O(1)
    public static long fiboTab(int n)
    {
        long fiboarr[] = new long[n+1];
        fiboarr[0] = 0;
        fiboarr[1] = 1;
        for(int i=2;i<=n;i++)
        {
            fiboarr[i] = fiboarr[i-2]+fiboarr[i-1];
        }
        return fiboarr[n];
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println("the fibonacci series value is :"+ fiboTab(n));
    }
}