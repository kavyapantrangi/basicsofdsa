class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[]ans=new int[2];
        int n=nums.length;
       for(int i=0;i<n-1;i++)
       {
        for(int j=i+1;j<n;j++)
        {
        if(nums[i]+nums[j]==target)
        {
            ans[0]=i;
            ans[1]=j;
        }
       }
       }
       return ans;
        
    }
}
By using Map:
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int[]ans=new int[2];
        int n=nums.length;
      
    
      for(int i=0;i<n;i++)
      {
        if(map.containsKey(target-nums[i]))
        {
            ans[0]=i;
            ans[1]=map.get(target-nums[i]);
        }
         map.put(nums[i],i);
      }
      return ans;
        
    }
}
space complexity:O(n)
time complexity:O(n)

    //
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        // int[]ans=new int[2];
        int n=nums.length;
      
    
      for(int i=0;i<n;i++)
      {
        if(map.containsKey(target-nums[i]))
        {
            // ans[0]=i;
            // ans[1]=map.get(target-nums[i]);
        return new int[]{i,map.get(target-nums[i])};
        }
         map.put(nums[i],i);
      }
      return new int[]{};
        
    }
}
