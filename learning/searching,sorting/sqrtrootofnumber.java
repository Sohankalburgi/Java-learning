import java.util.Scanner;

public class sqrtrootofnumber {
    
    static public int findSquareRoot(int num)
    {
        //T(n) = O(log N)
        //S(n) = O(1)
        int low =0;// binary search 
        int high = num;
        int result = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            long val = mid*mid;
            if(val==num)
            {   //perfect square
                return mid;
            }
            else if(val<num)
            {   
                //lower bound square and result to store if in case no further is present
                result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to get the square root:");
        int num = sc.nextInt();
        
        int result = findSquareRoot(num);
        System.out.println("the square root :" +result);
    }
}
