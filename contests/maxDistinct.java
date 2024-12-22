class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int min=nums[0]-k;
        int unique=0;
        for(int i=0;i<nums.length;i++)
        {
            if(min<=nums[i]+k)
            {
                min=Math.max(min,nums[i]-k)+1;
                unique++;
            }
        }
        return unique;
    }
}
