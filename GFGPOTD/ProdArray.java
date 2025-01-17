class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n=arr.length;
        int[]res=new int[n];
        int[]left=new int[n];
        int[]right=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*arr[i-1];
        }
        for(int j=n-2;j>=0;j--)
        {
            right[j]=right[j+1]*arr[j+1];
        }
        for(int i=0;i<n;i++)
        {
            res[i]=left[i]*right[i];
        }
        return res;
        // code here
    }
}
