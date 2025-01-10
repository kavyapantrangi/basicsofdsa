class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        
        Map<Integer,Integer>map=new HashMap<>();
        k--;
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(i<k)continue;
            ans.add(map.size());
            
                
                if(map.get(arr[i-k])==1)
                {
                    map.remove(arr[i-k]);
                }
                else
                {
                    map.put(arr[i-k],map.get(arr[i-k])-1);
                }
            
        }
        return ans;
        // code here
    }
}
