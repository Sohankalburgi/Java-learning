import java.util.Scanner;

public class q5_perfectsquarecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int low = 0;
        int high = num;
        boolean flag = false;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            long val = mid*mid;

            if(val==num)
            {
                flag = true;
                break;
            }
            else if(val>num)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(flag)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        
    }
}
