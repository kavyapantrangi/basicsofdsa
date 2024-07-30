class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {

set.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
if(!set.contains(i+1))
{
    ans.add(i+1);
}

        }
        return ans;
        
    }
}
