class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        int n=arr.length;
      
        long sum1=0;
        long sum2=0;
        for(int i=0;i<n;i++)
        {
            sum2+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            sum2=sum2-arr[i];
            if(sum1==sum2)
            {
                return i+1;
            }
            sum1+=arr[i];
        }
        
        
        return -1;
        // Your code here
    }
}
