import java.util.ArrayList;



public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int low=0;
        int high=0;
        int n=boards.size();

        for(int i=0;i<n;i++)
        {
            low=Math.max(low,boards.get(i));
            high+=boards.get(i);
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int ans=can(boards,mid);
            if(ans>k)

            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static int can(ArrayList<Integer> boards, int k)
    {
        int paint=0;
        int mem=1;
        for(int i=0;i<boards.size();i++)
        {
            if(paint+boards.get(i)<=k)
            {
                paint+=boards.get(i);
            }
            else
            {
                paint=boards.get(i);
                mem++;
            }
        }
        return mem;
    }

}
