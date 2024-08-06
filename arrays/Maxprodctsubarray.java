class Solution {
    public int maxProduct(int[] nums) {
        long ans=nums[0];
        int n=nums.length;
       long left=1;
       long right=1;
       for(int i=0;i<n;i++)
       {
       left= (left==0||left<Integer.MIN_VALUE)?1:left;
       right= (right==0||right<Integer.MIN_VALUE)?1:right;
       //left product
       left*=nums[i];
       //right product
       right*=nums[n-i-1];
       //calculate max among them
       ans=Math.max(ans,Math.max(left,right));
       }
       return (int)ans;
        
    }
}
