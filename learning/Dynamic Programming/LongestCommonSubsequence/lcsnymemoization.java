package LongestCommonSubsequence;
// time complexity - O(n*m)
// space complexity - O(n*m)

public class lcsnymemoization {

    public static int lcs(String s1,String s2,int m,int n,int [][]dp)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return 1+lcs(s1, s2, m-1, n-1, dp);
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }
        else{
            return dp[m][n] = Math.max(lcs(s1,s2,m-1,n,dp),lcs(s1,s2,m,n-1,dp));
        }
    }
    public static void main(String[] args) {
        String s1 = "AGGTAYB";
        String s2 = "GXTXAYB";
        int m = s1.length();
        int n = s2.length();

        int [][]dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j] = -1;
            }
        }

        System.out.println("the Longest Common Subsquence by memoization:"+ lcs(s1,s2,m,n,dp));
    }
}
