Brute Force Approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Set<List<Integer>>list=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                       List<Integer>ans=Arrays.asList(nums[i],nums[j],nums[k]); 
                        
                        ans.sort(null);
                         list.add(ans);

                    }
                }
               
            }
            //  list.add(ans);
        }

        return new ArrayList<>(list);
    }
}//Tc-O(N3)




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<Integer>ans=new ArrayList<>();
        Set<List<Integer>>list=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            Set<Integer>s=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third=-(nums[i]+nums[j]);
                if(s.contains(third))
                {
List<Integer>ans=Arrays.asList(nums[i],nums[j],third);
Collections.sort(ans);
list.add(ans);
                }
                
                
               s.add(nums[j]);
            }
            
            //  list.add(ans);
        }

        List<List<Integer>> res=new ArrayList<>(list);
        return res;
    }
}
//Tc(O2)
