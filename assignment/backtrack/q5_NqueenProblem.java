import java.util.Scanner;

public class q5_NqueenProblem {
    static int[][] Nqueen(int n)
    {
        int [][]board = new int[n][n];

        Nqueen(board,n,0);
        return board;
    }
    public static boolean issafe(int [][]board,int r,int c)
    {
        //for checking vertical row 
        for(int i=1;i<r;i++)
        {
            if(board[i][c]==1)
            {
                return false;
            }
        }
        int maxleft = Math.min(r,c);
        //for left diagonal
        for(int i=1;i<=maxleft;i++)
        {
            if(board[r-i][c-i]==1)
            {
                return false;
            }
        }
        

        int maxright = Math.min(r,board.length-1-c);
        for(int i=1;i<=maxright;i++)
        {
            if(board[r-i][c+1]=='Q')
            {
                return false;
            }
        }
        return true;
    }

    static void Nqueen(int [][]board,int n,int row)
    {
        if(row>n)
        {
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(issafe(board, row, col))
            {
                board[row][col] = 1;
                Nqueen(board, n, row+1);
                board[row][col] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ans = Nqueen(n);
        System.out.println("The number of Queens "+ans);
    }
}
