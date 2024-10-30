class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++)
        
        {
            if(map.containsKey(arr[i]-k))
            
            {
            count+=map.get(arr[i]-k);
            }
        }
        return count;
    }
}
