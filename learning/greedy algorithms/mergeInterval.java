import java.util.Arrays;
import java.util.LinkedList;

public class mergeInterval {
    class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. need to sort the intervals in increasing order
        // [0] - start index
        // [1] - end index
        // time complexity = O(n logn)
        // space Complexity = O(n)
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

        //2. iterate over all intervals and then check the merge exits
        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] interval : intervals)
        {
            // no overloop
            if(merged.isEmpty() || merged.getLast()[1]<interval[0])
            {
                merged.add(interval);
            }
            else 
            {
                merged.getLast()[1]= (merged.getLast()[1]>interval[1])? merged.getLast()[1]:interval[1];
            }
        }
        return merged.toArray(new int [merged.size()][]);
    }
}
}
