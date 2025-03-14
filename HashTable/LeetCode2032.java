class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer>ans=new ArrayList<>();
       int[]arr1=new int[101];
       int[]arr2=new int[101];
       int[]arr3=new int[101];
       for(int num:nums1)arr1[num]=1;
       for(int num:nums2)arr2[num]=1;
       for(int num:nums3)arr3[num]=1;
       for(int i=1;i<101;i++)
       {
        if(arr1[i]+arr2[i]+arr3[i]>1)ans.add(i);
       }
       return ans;
    }
}
