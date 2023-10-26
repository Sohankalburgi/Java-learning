package matrixchainmultiplication;
import java.lang.Math;
public class matrixchainmultiplication {

    public static int MCM(int []arr,int i,int j)
    {
        // base case
        if(i==j){
            return 0;
        }
        int minopr = Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int opr = MCM(arr,i,k)+MCM(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
            minopr = Math.min(opr,minopr);
        }
        return minopr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3};
        int n = arr.length;
        System.out.println("The Minimum operations for above matrix multiplication :"+ MCM(arr,1,n-1));
    }
}
