approach 1:
it takes another extra space for storing the positive numbers and storing the negative numbers
  class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[]ans=new int[nums.length];
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                a.add(nums[i]);
            }
            else
            {
                b.add(nums[i]);
            }
        }
        int j=0;
        for(int i=0;i<n/2;i++)
        {
            ans[j++]=a.get(i);
            ans[j++]=b.get(i);
        }
        return ans;
        
    }
}
