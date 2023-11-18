import java.util.Scanner;

public class pathwithMaximumgold {
    
    public static int getMaximumGold(int [][]grid,int n,int m)
    {
        int Maxi = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!=0)
                {
                    int gold = findMaxGold(grid,n,m,i,j,new boolean[n][m]);
                    Maxi = Math.max(Maxi,gold);
                }
            }
        }
        return Maxi;
    }

    public static int findMaxGold(int [][]grid,int n,int m,int i,int j,boolean[][] check)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || check[i][j]==true )
        {
            return 0;
        }
        check[i][j] = true;
        int left = findMaxGold(grid,n,m,i,j-1,check);
        int right = findMaxGold(grid,n,m,i,j+1,check);
        int upward = findMaxGold(grid,n,m,i-1,j,check);
        int down = findMaxGold(grid,n,m,i+1,j,check);
        check[i][j] = false;
        return Math.max(left,Math.max(right,Math.max(upward,down)))+grid[i][j];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] grid = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j] = sc.nextInt();
            }
        }
        int res = getMaximumGold(grid,n,m);
        System.out.println(res);
    }
}
