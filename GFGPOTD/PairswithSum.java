class Solution {

    int countPairs(int arr[], int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int count=0;
        int n=arr.length;
        // map.put(0,1);
        for(int i=0;i<n;i++)
        {
            // sum+=arr[i];
            if(map.containsKey(target-arr[i]))
            {
                count+=map.get(target-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
            
        }
        return count;
        // Complete the function
    }
}
