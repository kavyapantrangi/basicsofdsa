class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int min=1;
        for(int i=0;i<piles.length;i++)
        {
max=Math.max(piles[i],max);
        }
        while(min<max)
        {
            int mid=(min+max)/2;
            if(can(piles,h,mid))
            {
                max=mid;
            }
            else
            {
                min=mid+1;
            }
        }
        return min;
    }
       
        public boolean can(int[]piles,int h,int s)
        {
             int ans=0;
        for(int i=0;i<piles.length;i++)
        {
ans+=Math.ceil((double)piles[i]/s);
        }
        
        
    
    return ans<=h;
    }
}
