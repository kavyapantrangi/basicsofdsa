class Solution {
    public boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int target=2*arr[i];
            int low=0;
            int high=n-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(arr[mid]==target&&mid!=i)
                {
                    return true;
                }
                else if(arr[mid]>target)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
        }
        return false;

       
        
    }
}
