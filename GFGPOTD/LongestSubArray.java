class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int max=0;
        int sum=0;
        int n=arr.length;
        
        Map<Integer,Integer>map=new HashMap<>();
        // map.put(0,0);
        for(int i=0;i<n;i++)
        {
            
            sum+=arr[i];
            if(sum==k)
            {
                max=Math.max(max,i+1);
            }
            if(map.containsKey(sum-k))
            {
                max=Math.max(i-map.get(sum-k),max);
                
            }
            if(!map.containsKey(sum))
            map.put(sum,i);
        }
        return max;
    }
}
