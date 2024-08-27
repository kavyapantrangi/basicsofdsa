class Solution {
    long floorSqrt(long n) {
        long low=1;
        long high=n;
        long ans=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(mid*mid<=n)
            {
                
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return high;
        // Your code here
    }
}
