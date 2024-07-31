Bruteforce:
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][]ans=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=ans[i][j];
            }
        }
        
    }
}


//optimal approach without using the extra space
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //transpose a matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse the row
        for(int i=0;i<n;i++)
        {
            reverse(matrix[i]);
        }

        
    }
    public  void  reverse(int[]arr)
    {
        int i=0;
         int j=arr.length-1;
        while(i<=j)
        {
            
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
}
