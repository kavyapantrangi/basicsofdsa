class Solution {
    public void moveZeroes(int[] nums) {
        int ZeroIndex=0;
        // int NonZeroIndex=1;
        int i=0;
        int n=nums.length;
        int insert=0;
        while(i<n)
        {
            if(nums[i]!=0)
            {
                nums[insert++]=nums[i];
            }
            i++;
        }
        while(insert<n)
        {
            nums[insert++]=0;
        }




        
    }
}
