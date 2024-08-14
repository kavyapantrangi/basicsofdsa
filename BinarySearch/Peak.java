class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(nums.length==1)return 0;
        if(nums[n-1]>nums[n-2])return n-1;
        //by using binary search
        int low=1;
        int high=nums.length-2;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1])return mid;
            else if(nums[mid]<nums[mid-1])high=mid-1;
            else if(nums[mid]<nums[mid+1])low=mid+1;
        }
        return  0;
        
    }
}
