public class localandglobalinversion {


    public static boolean isIdealPermutation(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length-2;i++)
        {
            max = Math.max(max,nums[i]);
            if(max> nums[i+2])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr= {1,0,2};
        System.out.println(isIdealPermutation(arr));
    }
}
