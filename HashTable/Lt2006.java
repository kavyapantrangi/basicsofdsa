class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
          int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            count+=map.getOrDefault(nums[i]-k,0);
             count+=map.getOrDefault(nums[i]+k,0);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      
        
        return count;
    }
}
