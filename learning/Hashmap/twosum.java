import java.util.Scanner;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        } 
        // taking the input (target)
        System.out.println("Enter the target :");
        int target = sc.nextInt();

        // creating the hashmap where (keys are arr[i]) and values are index
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],i);
        }
        //create the result array to store the numbers
        int []result = new int[n];
        // if current element is equal to target
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        if(target>sum )
        {
            result[0]= -1;
            result[1] = -1;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target && map.containsKey(0))
            {
                result[0] = i;
                result[1] = map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i]))
            {
                if(map.get(target -arr[i])>i)
                {
                    result[0] = i;
                    result[1] = map.get(target-arr[i]);
                    break;
                }
            }
        }

        System.out.println("Two sum index values :"+result[0]+"and"+result[1]);

    }
}
