//o(n) -space complexity
//o(n)-time complexity
class Solution {
    public void rotate(int[] nums, int k) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           res[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=res[i];
        }
        
    }
}
//o(1)-space complexity
//o(n)-time complexity
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
       
        
    }
    public void reverse(int[]nums,int i,int j)
    {
       while(i<=j)
       {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
    }
}
