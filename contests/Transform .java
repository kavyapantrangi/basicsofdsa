class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[]result=new int[n];
        for(int i=0;i<n;i++)
            {
               
                if(nums[i]>0)
                {
                      int in=(nums[i]+i)%n;
                    result[i]=nums[in];
                   
                }
                else if(nums[i]<0)
                {
                      int in=(nums[i]+i)%n;
                    if(in<0)
                    {
                        in=in+n;
                      
                    }
                      result[i]=nums[in];
                    
                        
                }
                else
                {
                    result[i]=nums[i];
                }
            }
        return result;
        
    }
}
