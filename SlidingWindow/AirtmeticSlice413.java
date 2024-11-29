class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<3)
        {
            return 0;
            //that we cannot find theAirthmentic subarray with 1,2, elemeny
        }
        int count=0;
        int curr=0;
        for(int i=2;i<n;i++)
        {
if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
{
    curr++;
    count+=curr;
}
else
{
    curr=0;
}
        }
        return count;
        
    }
}
