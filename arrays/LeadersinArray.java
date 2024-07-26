class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer>ans=new ArrayList<>();
        // int n=arr.length;
        int max=arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=Math.max(arr[i],max);
                ans.add(arr[i]);
            }
        }
        ans=Collections.reverse(ans);
        return ans;
       
    }
}
//O(N)-time complexity
O(N)-space complexity in the worst case it will be O(N);
