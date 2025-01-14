class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        
    // arr: input array
    // Function to find equilibrium point in the array.
   
        int n=arr.length;
      
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum2+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            sum2=sum2-arr[i];
            if(sum1==sum2)
            {
                return i;
            }
            sum1+=arr[i];
        }
        
        
        return -1;
        // Your code here
    }
}
        // code here
    
