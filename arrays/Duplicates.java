usig hashmap:
  class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet())
        {
            if(map.get(i)>1)
            {
                list.add(i);
            }
        }
        return list;
        
    }
}
//without using hashmap
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        if(nums[Math.abs(nums[i])-1]<0)
        {
            list.add(Math.abs(nums[i]));
        }
        else
        {
            nums[Math.abs(nums[i])-1]*=-1;
        }
    }
    return list;
    }
}

