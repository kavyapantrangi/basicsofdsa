
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0,high=m-1;
        while(low<=high)
        {
            int max=0;
            int mid=(low+high)/2;
            for(int row=0;row<n;row++)
            {
                if(mat[row][mid]>mat[max][mid])
                {
                    max=row;
                }
            }
            int currEle=mat[max][mid];
            int left=mid==0?-1:mat[max][mid-1];
            int right=mid==m-1?-1:mat[max][mid+1];
            if(currEle>left&&currEle>right)
            {
                return new int[]{max,mid};
            }
            else if(currEle<left)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
        
        
    }
}
