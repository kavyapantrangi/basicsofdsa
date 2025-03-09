###########LeetCode-2500###############
Approach:
Sorting the each row and calculating the maximum number in each column by iterating from last col.\
have to iterate over the column then only we can find the maximum element in the column.
   
  TC: O(m.nlogn)+O(n.m)

  
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        // int n=grid.length;
        for(int i=0;i<grid.length;i++)
        {
        Arrays.sort(grid[i]);
        }
        int n=grid.length;
        for(int j=grid[0].length-1;j>=0;j--)
        {
            int max=0;
            for(int i=0;i<n;i++)
            {
                max=Math.max(grid[i][j],max);
            }
            ans+=max;
        }
        return ans;
    }
}
