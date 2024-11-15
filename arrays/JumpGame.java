class Solution {
    public boolean canJump(int[] nums) {
        int covrage=0,lastjump=0;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            covrage = Math.max(covrage,i+nums[i]);
            if(i==lastjump){
                lastjump=covrage;
                if(covrage>=nums.length-1){
                    return true;
                }
            }
        }
        return false;
    }
}
