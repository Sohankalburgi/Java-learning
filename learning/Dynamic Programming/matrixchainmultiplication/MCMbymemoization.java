package matrixchainmultiplication;

public class MCMbymemoization {

    public static int MCM(int []arr,int i,int j,int [][]dp)
    {
        // base case
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int minopr = Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int opr = MCM(arr,i,k,dp)+MCM(arr,k+1,j,dp)+(arr[i-1]*arr[k]*arr[j]);
            minopr = Math.min(opr,minopr);
        }

        return dp[i][j] = minopr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3};
        int n = arr.length;
        int [][]dp = new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println("The Minimum operations for above matrix multiplication :"+ MCM(arr,1,n-1,dp));
    }
}
