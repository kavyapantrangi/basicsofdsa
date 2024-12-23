class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<Integer>curr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        generate(0,nums,curr,res);
        
        return res;
        
        // code here
    }
    public void generate(int ind,int[]nums,List<Integer>current,List<List<Integer>>res)
    {
        // if(!res.contains(new ArrayList<>(current)))
        res.add(new ArrayList<>(current));
        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind&&nums[i]==nums[i-1])continue;
            current.add(nums[i]);
            generate(i+1,nums,current,res);
            current.remove(current.size()-1);
        }
    
}
}
