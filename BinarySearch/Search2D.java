Bruteforce approach:
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //btuteforce
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}
Bettter Approach:
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            if(matrix[i][0]<=target&&target<=matrix[i][n-1])
            {
             return  bs(matrix[i],target);
            }
        }
        return false;
        
    }
    public boolean bs(int[]arr,int tar)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tar)
            {
                return true;
            }
            else if(arr[mid]>tar)
            {

                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;

    }
}
