class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        for(int i=0;i<k;i++)
        {
           int index=min(nums);
           nums[index]*=multiplier;
        }
        return nums;

        
    }
    public int  min(int[]arr)
    {
        int n=arr.length;
        int mi=arr[0];
        int index=0;
        for(int i=0;i<n;i++)
        {
if(arr[i]<mi)
{
    mi=arr[i];
index=i;
}
        }
        return index;
    }
}
