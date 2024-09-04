class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long val=(long)m*k;
        if(val>n)
        {
            return -1;                                   
        }
        int min=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(canbloom(bloomDay,k,mid,m))
            {
                 max=mid-1;
            }
            else
            {
                min=mid+1;
               
            }
        }
        return min
        ;
        
    }
    public boolean canbloom(int[]bloom,int k,int day,int m)
    {
        int n=bloom.length;
        int count=0;
        int nofB=0;
        for(int i=0;i<n;i++)
        {
            if(bloom[i]<=day)
            {
                count++;
            }
            else
            {
                nofB+=count/k;
                count=0;
            }
        }
        nofB+=count/k;
         return nofB>=m;
    }
   
}
