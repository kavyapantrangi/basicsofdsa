class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int low=1;

        int high=max;
        int a=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(can(nums,mid,threshold))
            {
                a=mid;
                high=mid-1;
               
            }
            else
            {
                low=mid+1; 
            }
        }
        return a;

        
    }
    public boolean can(int[]nums,int mid,int thre)
    {
int ans=0;
for(int i=0;i<nums.length;i++)
{
    ans+=(nums[i]+mid-1)/mid;
}
return ans<=thre;
    }

}
