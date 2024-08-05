Brute force:
  Tc(O(N*4))
  Sc:
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>>ans=new HashSet<>();
        // int sum=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    for(int l=k+1;l<n;l++)
                    {
                      int sum=nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum==target)
                        {
                        List<Integer>in=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        Collections.sort(in);
                        ans.add(in);
                        }
                    }
                }
            }
        }


        List<List<Integer>>ans1=new ArrayList<>(ans);
        return ans1;
        
    }
}

By using two pointers but here we fixed two variables like in 3 sum we fix 1 variable
  class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int k=j+1;
                int l=n-1;
                
                while(k<l)
                {
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[k]+(long)nums[l];
                if(sum<target)
                {
                    k++;
                }
                else if(sum>target)
                {
                    l--;
                }
                else
                {
                    List<Integer>a=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                    ans.add(a);
                    k++;
                    l--;
                    while(k<l&&nums[k]==nums[k-1])k++;
                    while(k<l&&nums[l]==nums[l+1])l--;
                }
                }
            }
        }
        return ans;
    }
}
