//using set data structure
//here we are using the extra space that is set to store and check

class Solution {
    public int missingNumber(int[] nums) {
        int ans=-1;
        Set<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        for(int i=0;i<=n;i++)
        {
if(set.contains(i))continue;
else ans=i;
        }

        return ans;
    }
}

//optinal approach
O(n)-time complexity
O(1)-space complexity
  
//class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
       int ans=n;
       for(int i=0;i<n;i++)
       {
        ans=ans^nums[i];
        ans=ans^i;
       }
       return ans;
    }
}
