class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Math.max(nums[i],max);
        }
        int low=max;
        int high=sum;
       while(low<=high)
       {
        int mid=(low+high)/2;
        int c=can(nums,mid);
        if(c>k)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
       }
        return low;
        
    }
    public int can(int[]arr,int split)
    {
        int s=1;
        int s2=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]+s2<split)
            {
                s2+=arr[i];
            }
            else
            {
                s2=arr[i];
                s++;
            }
        }
        return s;
    }
}
