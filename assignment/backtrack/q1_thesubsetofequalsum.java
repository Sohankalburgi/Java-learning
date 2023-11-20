import java.util.*;



     class PartitionArray {

        public static boolean canPartitionIntoSubsets(int[] arr, int k) {
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }
    
            // Check if it's possible to divide the array into k subsets
            if (totalSum % k != 0) {
                return false;
            }
    
            int targetSum = totalSum / k;
            int[] subsetSums = new int[k];
    
            // Helper function for backtracking
            return backtrack(arr, 0, subsetSums, targetSum);
        }
    
        private static boolean backtrack(int[] arr, int index, int[] subsetSums, int targetSum) {
            // If all elements are assigned to a subset
            if (index == arr.length) {
                for (int subsetSum : subsetSums) {
                    if (subsetSum != targetSum) {
                        return false;
                    }
                }
                return true;
            }
    
            // Try assigning the current element to each subset
            for (int i = 0; i < subsetSums.length; i++) {
                if (subsetSums[i] + arr[index] <= targetSum) {
                    subsetSums[i] += arr[index];
                    if (backtrack(arr, index + 1, subsetSums, targetSum)) {
                        return true;
                    }
                    subsetSums[i] -= arr[index];
                }
            }
    
            return false;
        }
    
        public static void main(String[] args) {
            int[] arr = {4, 3, 2, 3, 5, 2, 1};
            int k = 4;
            boolean result = canPartitionIntoSubsets(arr, k);
            System.out.println(result);
        }
    }
    
