class Solution {
    public int maxWater(int arr[]) {
        int n=arr.length;
        int lmax=0;
        int rmax=0;
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<j)
        {
            if(arr[i]<=arr[j])
            {
                if(lmax<arr[i])
                {
                    lmax=arr[i];
                    
                }
                else
                {
                    ans+=lmax-arr[i];
                    
                }
                i++;
            }
            else
            {
                if(rmax<arr[j])
                {
                    rmax=arr[j];
                }
                else
                {
                    ans+=rmax-arr[j];
                }
                j--;
            }
        }
        return ans;
        // code here
    }
}
