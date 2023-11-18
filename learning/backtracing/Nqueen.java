import java.util.ArrayList;
import java.util.Scanner;

public class Nqueen {
    static boolean isSafe(int[][]board,int a,int b)
    {
        int n = board.length;
       
        
        for(int i=a;i>=0;i--)
        {
            // toward up
            if(board[i][b]==1)
            {
                return false;
            }
        }
        
        int maxRight = Math.min(a, board.length-b-1);
        for(int i=1;i<=maxRight;i++)
        {
            if(board[a-i][b+i]==1)
            {
                return false;
            }
        }        
   
   //check right diagonal
       int maxLeft = Math.min(a,b);
       for(int i=1;i<=maxLeft;i++)
        {
            if(board[a-i][b-i]==1)
            {
                return false;
            }
        }   
   
   return true;
        
    }
    
    static void backtrack(int[][]board,int n,ArrayList<ArrayList<Integer>>res,ArrayList<Integer> container,int row)
    {
        if(row==n)
        {
            res.add(new ArrayList<>(container));
            return;
        }
        
        for(int col = 0; col<n ; col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = 1;
                container.add(col+1);
                backtrack(board,n,res,container,row+1);
                board[row][col] = 0;
                container.remove(container.size()-1);
            }
        }
    }
    
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int [][]board = new int[n][n];
        backtrack(board,n,res,new ArrayList<>(),0);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> res= nQueen(sc.nextInt());
        System.out.println(res);
    }
}
