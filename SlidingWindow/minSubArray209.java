class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        int n=nums.length;
        int sum=0;
       for(int i=r;i<n;i++)
        {
            sum+=nums[i];
           while(sum>=target)
           {

            min=Math.min(min,i-l+1);
            sum-=nums[l];
            l++;
           }
           
        }
        if(min==Integer.MAX_VALUE)return 0;
        return min;
        
    }
}
