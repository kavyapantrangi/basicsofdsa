Bruteforce approch:
  class Solution {
    public int rowWithMax1s(int arr[][]) {
        int index=-1;
        
        int max=0;
        int n=arr.length;
        int m=arr[0].length;
        // code here
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                count+=arr[i][j];
            }
            if(count>max)
            {
                max=count;
                index=i;
            }
        }
        return index;
    }
}
Tc:O(N*M)
sc:O(1)
optimal approach:
class Solution {
    public int rowWithMax1s(int arr[][]) {
        int index=-1;
        int max=0;
        int n=arr.length;
        int m=arr[0].length;
        // code here
        for(int i=0;i<n;i++)
        {
            int count=m-firstOccur(arr[i],m,1);
            if(count>max)
            {
                index=i;
                max=count;
            }
        }
        return index;
    }
    public int firstOccur(int[]arr,int len,int x)
    {
        int low=0;
        int high=len-1;
        int ans=len;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}
  
Tc:O(N*log 2m)
sc:O(1)
