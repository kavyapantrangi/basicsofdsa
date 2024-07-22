Bruteforce:
//Largest sum in a subarray
class Solution {
    public int maxSubArray(int[] nums) {
       
       int max=Integer.MIN_VALUE;
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
        int sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=nums[j];
        
        max=Math.max(sum,max);                //tc--O(N^2)
                                              //sc:O(1)
        }
       }
        return max;
    }
}
//optimal approach:
class Solution {
    public int maxSubArray(int[] nums) {
       
       int max=Integer.MIN_VALUE;
       int n=nums.length;
       int sum=0;
       for(int i=0;i<n;i++)
       {
        
            sum+=nums[i];
        
        max=Math.max(sum,max);
        if(sum<0)
        {
            sum=0;
        }
        }
      
        return max;
    }
}
//Tc:O(N)
//sc:O(1);
