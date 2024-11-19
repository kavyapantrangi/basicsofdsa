import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = 0;
        int l = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int r = 0; r < nums.length; r++) {
            
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            
            set.add(nums[r]);
            sum += nums[r];

            //to check the k window
            if (r - l + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                
                //move o next window
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
        }

        return maxSum;
    }
}
