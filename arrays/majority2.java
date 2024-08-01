class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(int i:map.keySet())
        {
            if(map.get(i)>Math.floor(n/3))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}












Extended moore voting algorithm
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int n=nums.length;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(count1==0&&nums[i]!=ele2)
            {
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0&&nums[i]!=ele1)
            {
                count2=1;
                ele2=nums[i];
            }
            else if(nums[i]==ele1)count1++;
            else if(nums[i]==ele2)count2++;
            else 
            {
                count1--;
                count2--;
            }
        }
       int c1=0;
       int c2=0;
       for(int i=0;i<n;i++)
       {
        if(ele1==nums[i])c1++;
        if(ele2==nums[i])c2++;
       }
       if(c1>Math.floor(n/3))ans.add(ele1);
       if(c2>Math.floor(n/3))ans.add(ele2);
        return ans;
    }
}
