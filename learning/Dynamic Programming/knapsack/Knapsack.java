package knapsack;
public class Knapsack
{
    // RECURSIVE METHOD
    // TIME COMPLEXITY O(2^N)- EXPONTENTIAL TIME COMPLEXITY
    // SPACE COMPLEXITY O(N)
    public static int Knapsack(int []profit,int []weight,int m,int n)
    {
        if(m == 0 || n == 0)
        {
            // BASE CASE
            return 0;
        }

        // RECURSIVE FUNCTION CALL
        if(weight[n-1]>m)
        {
            // exclude the object
            return Knapsack(profit,weight,m,n-1);
        }
        else{
            return Math.max(Knapsack(profit, weight, m,n-1),profit[n-1]+Knapsack(profit,weight,m-weight[n-1],n-1));
        }

    }

    public static int Knapsackmemo(int [] profit,int []weight,int m,int n,int [][]dp)
    {
        if(m == 0 || n == 0)
        {
            // BASE CASE
            return 0;
        }
        // optimisation
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }

        // RECURSIVE FUNCTION CALL
        if(weight[n-1]>m)
        {
            // exclude the object
            return dp[n][m]=Knapsack(profit,weight,m,n-1);
        }
        else{
            // max(exclude,include)
            return dp[n][m]=Math.max(Knapsack(profit, weight, m,n-1),profit[n-1]+Knapsack(profit,weight,m-weight[n-1],n-1));
        }
    }

    // FUNCTION DEFINITION OF MEMOIZATION METHOD
    public static int helper(int m,int []profit,int []weight,int n)
    {
        // initialisation of 2 D Array named DP
        int dp [][] = new int [n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                dp[i][j] = -1;
            }
        }

        return Knapsackmemo(profit, weight, m, n,dp);

    }
    public static void main(String[] args) {
        int profit[] = {60,100,120};
        int weight[] = {10,20,30};
        int maximumCapacity = 50;
        int noOfObjects = profit.length;

        System.out.println("the Maximum profit in knapsack using Dp :"+helper(maximumCapacity, profit, weight, noOfObjects) );
        System.out.println("the Maximum profit of a given Knapsack is :"+ Knapsack(profit, weight,maximumCapacity,noOfObjects));
    }
}