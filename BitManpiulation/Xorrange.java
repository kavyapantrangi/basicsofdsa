class Solution{
    public int getXor(int[] nums, int a, int b){
        int xor=0;
        
        for(int i=a;i<=b;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
        // Code here 
    }
}
