import java.util.ArrayList;
import java.util.List;

public class permutation {

    public static void backtrack(List<List<Integer>> result,List<Integer> perm,int []nums)
    {
        // base case
        if(perm.size()==nums.length)
        {
            result.add(new ArrayList<>(perm));
            return;
        }

        for(int i=0;i<nums.length;i+=1)
        {
            if(perm.contains(nums[i]))
            {
                continue;
            }
            perm.add(nums[i]);
            backtrack(result,perm,nums);
            perm.remove(perm.size()-1);
        }

    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(permute(nums));
    }

}
