class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int farthest=0;
        int jumps=0;
        int curr=0;
        for(int i=0;i<n-1;i++)
        {
            farthest=Math.max(farthest,nums[i]+i);
            if(i==curr)
            {
                jumps++;
                curr=farthest;
            }
        }
       return jumps;
        
    }
}

//gfg minmumjumps ::


class Solution {
    static int minJumps(int[] arr) {
        int n=arr.length;
        int jumps=0;
        int curr=0;
        int farthest=0;
        if(arr[0]==0)return -1;
        for(int i=0;i<n;i++)
        
        {
            //if we reached the last index;
            if(i==n-1)return jumps;
            farthest=Math.max(farthest,arr[i]+i);
            //if we reach the edge of current range
            if(i==curr)
            {
                jumps++;
                curr=farthest;
            }
            //if the current range doesnt exist
            if(curr<=i)return -1;
        }
        
        return -1;
        // code here
    }
}
