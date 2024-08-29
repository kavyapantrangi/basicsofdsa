class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<List<Integer>>s=new HashSet<>();
        Set<Integer>set=new HashSet<>();

        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
if(set.contains(nums[i]-k)||set.contains(nums[i]+k))
{
    s.add(new ArrayList<>(Arrays.asList(nums[i],nums[i]-k)));
}
set.add(nums[i]);
        }
        return s.size();
    }
}
