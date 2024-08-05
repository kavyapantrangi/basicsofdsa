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
//Tc :O(N2 * log(no. of unique triplets)
sc:O(n)//for set data structure
By using the  Two pointer approach
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<Integer>ans=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0&&nums[i-1]==nums[i])continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else
                {
                    List<Integer>a=Arrays.asList(nums[i],nums[j],nums[k]);
                    list.add(a);
                    j++;
                    k--;
                    while(j<k&&nums[j]==nums[j-1])j++;
                    while(j<k&&nums[k]==nums[k+1])k--;

                }
            }
        }
        return list;
    }
}
//Tc:O(NlogN)+O(N*2)
Sc:O(1)
