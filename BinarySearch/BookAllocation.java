import java.util.ArrayList;
public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=arr.get(i);
            max=Math.max(max,arr.get(i));
        }
        int low=max;
        int high=sum;
        if(m>n)
        {
            return -1;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int ans=can(arr,mid);
            if(ans>m)low=mid+1;
            else high=mid-1;
        }
        return low;

        // Write your code here.
    }
    public static int can(ArrayList<Integer>arr,int s)
    {
        int student=1;
        int pages=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)+pages<=s)
            {
                pages+=arr.get(i);
            }
            else{
                student++;
                pages=arr.get(i);
            }
        }
        return student;
    }
}
