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



Another Approach using by storing only answer and we should not require extra memory for storing positive and negative elements.


class Solution {
    public int[] rearrangeArray(int[] nums) {
       int i=0;
       int j=1;
       int[]result=new int[nums.length];
       int n=nums.length;
       for(int i1=0;i1<n;i1++)
       {
        if(nums[i1]>0)
        {
            result[i]=nums[i1];
            i=i+2;
        }
        else
        {
            result[j]=nums[i1];
            j=j+2;
        }
       }
       return result;
        
    }
}














  
