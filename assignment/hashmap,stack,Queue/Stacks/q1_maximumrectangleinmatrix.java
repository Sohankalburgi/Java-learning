import java.util.Scanner;
import java.util.Stack;

public class q1_maximumrectangleinmatrix
{
    public static int maximalRectangle(int matrix[][])
    {
        if(matrix.length==0)
        {
            return 0;
        }
        int noofrows = matrix.length;
        int noofcolumn = matrix[0].length;
        int maxArea = 0;
        int arr[] = new int[noofcolumn];
        for(int i=0;i<noofrows;i++)
        {
            for(int j=0;j<noofcolumn;j++)
            {
                arr[j] = matrix[i][j]==1 ? arr[j]+1:0;
            }
        }
        maxArea = Math.max(maxArea,findAreaInHistogram(arr));
        return maxArea;
    }

    public static int findAreaInHistogram(int []arr)
    {
        int len = arr.length;
        int maxArea = 0;
        int []left = new int [len];
        int []right = new int [len];
        Stack<Integer> stack = new Stack<>();
        
        // travel left to right and find the left limit
        for(int i=0;i<len;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                left[i] = 0;
            }
            else{
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                {
                    stack.pop();
                }
                left[i] = stack.isEmpty() ? 0:stack.peek()+1;
                stack.push(i);  
            }
        }

        //empty the stack
        while(!stack.isEmpty())
        {
            stack.pop();
        }

        // traversing right to left finding the right limit
        for(int i=len-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                stack.push(len-1);
                right[i] = len -1;
            }
            else{
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                {
                    stack.pop();
                }
                right[i] = stack.isEmpty()? len-1: stack.peek()-1;
                stack.push(i);
            }
        }
        int[] area = new int[len];
        for(int i=0;i<len;i++){
            area[i] = (right[i] - left[i] + 1) * arr[i];
            maxArea = Math.max(maxArea, area[i]);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0},{0,1,0,0},{0,0,0,1}};
	    System.out.println("The maximum area is : " + maximalRectangle(arr));

    }
}