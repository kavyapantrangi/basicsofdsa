class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][]dp=new int[n][n];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==n-1)
                {
                    dp[i][j]=triangle.get(i).get(j);

                }
                else
                {
                    dp[i][j]=Math.min(dp[i+1][j],dp[i+1][j+1])+triangle.get(i).get(j);
                }
            }
        }
        return dp[0][0];
        
    }
}
                  






