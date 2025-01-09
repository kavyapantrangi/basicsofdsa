class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        int target=0;
        Map<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int sum=0;
        map.put(0,0);
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==target)return true;
            if(map.containsKey(sum-target))
            {
                return true;
            }
            else
            {
                map.put(sum,i);
            }
        }
        return false;
        
        // Your code here
    }
}
