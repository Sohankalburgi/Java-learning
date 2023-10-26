package knapsack;
class Knapsacktabular
{
    public static int Knapsacktabularmethod(int m,int n,int [] profit,int[] weight)
    {
        int dp[][] = new int [n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int w=0;w<=m;w++)
            {
                if(i==0 || w==0)
                {
                    dp[i][w] = 0;
                }
                else if(weight[i-1] <= w)
                {
                    dp[i][w] = Math.max(dp[i-1][w],profit[i-1]+dp[i-1][w-weight[i-1]]);
                }
                else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int []profit = {1,2,5,6};
        int []weight = {2,3,4,5};
        int m = 8;
        int n = profit.length;

        // function calling
        System.out.println("Maximum profit using tabular approach :"+ Knapsacktabularmethod(m,n,profit,weight));
        
    }
}