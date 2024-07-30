//using map

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet())
        {
            if(map.get(i)>1)
            {
                return true;
            }
        }
        return false;
    }
}
//using Set
class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer>set=new HashSet<>();
      for(int i=0;i<nums.length;i++)
      {
        if(set.contains(nums[i]))
        {
            return true;
        }
        set.add(nums[i]);
      }
      return false;
    }
}
