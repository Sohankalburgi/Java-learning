import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        res.add(new ArrayList<>(currentList));
        
        for(int num : nums)
        {
            int n = res.size();
            for(int j=0;j<n;j++)
            {
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(num);
                
                res.add(temp);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(subsets(arr));
    }

}
