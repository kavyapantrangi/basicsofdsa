Time Complexity:O(NlogN)
  




class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int min=Integer.MIN_VALUE;
        int n=nums.length;
        int max=0;
        if(n==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i]-1==min)
            {
                count++;
                min=nums[i];

            }
            else if(nums[i]!=min)
            {
                count=1;
                min=nums[i];
            }
            max=Math.max(max,count);

        }
return max;
        
        
    }
}



Optimal Approach:
  class Solution {
    public int longestConsecutive(int[] nums) {
        // int count=1;
        int max=1;
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int it:set)
        {
            if(!set.contains(it-1))
            {
                int count=1;
                int x=it;
            
            while(set.contains(x+1))
            {
                count++;
                x=x+1;
            }
            
            max=Math.max(max,count);
            }
        }
        return max;
        
    }
}
