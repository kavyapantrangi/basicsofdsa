class Solution {
    public int shipWithinDays(int[] arr, int d) {
          int sum=0;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            max=Math.max(arr[i],max);
        }
        int low=max;
        int high=sum;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int day=days(arr,mid);
            if(day<=d)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    }
    public static int days(int[]arr,int cap)
    {
        int load=0;
        int d=1;
        int n=arr.length;
        
        for(int i=0;i<n-1;i++)
        {
            if(load+arr[i]>cap)
            {
                d=d+1;
                load=arr[i];
            }
            else
            {
                load+=arr[i];
            }
        }
        return d;
    }
        
    }
