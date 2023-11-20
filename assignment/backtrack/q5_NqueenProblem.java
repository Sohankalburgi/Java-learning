import java.util.Scanner;

public class q5_NqueenProblem {

    static boolean isSafe(int [][]board,int i,int j)
    {
        int n = board.length;
        for(int row=i;row>=0;row--)
        {
            if(board[row][j]==1)
            {
                return false;
            }
        }

        int maxRight = Math.min(i,board.length-j-1);
        for(int row=1;row<=maxRight;row++)
        {
            if(board[i-row][j+row]==1)
            {
                return false;
            }
        }

        int maxLeft = Math.min(i,j);
        for(int row=1;row<=maxLeft;row++)
        {
            if(board[i-row][j-row]==1)
            {
                return false;
            }
        }
        return true;
    }

    static int count = 0;
    static void backtrack(int [][]board,int n,int row)
    {
        
        if(row==n)
        {
            count++;
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] =1;
                backtrack(board, n,row+1);
                board[row][col]=0;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
         backtrack(board,n,0);
         System.out.println(count);
    }
}