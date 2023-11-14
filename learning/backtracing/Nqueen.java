import java.util.*;
class Solution {
    
    public static boolean issafe(char [][]board,int r,int c)
    {
        //for checking vertical row 
        for(int i=1;i<r;i++)
        {
            if(board[i][c]=='Q')
            {
                return false;
            }
        }
        int maxleft = Math.min(r,c);
        //for left diagonal
        for(int i=1;i<=maxleft;i++)
        {
            if(board[r-i][c-i]=='Q')
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
    public static List<String> makeString(char[][]board)
    {
        List<String> L = new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String row = new String(board[i]);
            L.add(row);
        }
        return L;
    }
    
    public static void queen(List<List<String>> ans,int n,int row,char board[][])
    {
        if(row==n-1)
        {
            ans.add(makeString(board));
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(issafe(board,row,col))
            {
                board[row][col] = 'Q';
                queen(ans,n,row+1,board);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            board[i][0]='.';
        }
        queen(ans,n,0,board);
        return ans;
    }
}

public class Nqueen {
    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.solveNQueens(4));
    }
}
