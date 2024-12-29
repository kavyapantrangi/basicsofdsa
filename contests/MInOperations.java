class Solution {
    public int minimumOperations(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        
        for(int i=1;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    {
                        if(grid[i][j]>grid[i-1][j])continue;
                    else
                        {
                            int val=Math.abs(grid[i][j]-grid[i-1][j])+1;
                                grid[i][j]+=val;
                            ans+=val;
                        }
                            
                    }
            }
        return ans;
        
    }
}
