class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int low=1;
        int high=m;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int ans=(int)Math.pow(mid,n);
            if(ans==m)
            {
                return mid;
            }
            else if(ans>m)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    
}
