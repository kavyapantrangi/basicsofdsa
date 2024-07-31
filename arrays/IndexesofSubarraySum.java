
class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        map.put(0,0);
        for(int i=0;i<n;i++)
        
        {
            
            sum+=arr[i];
            
            if(map.containsKey(sum-s))
            {
                ans.add(map.get(sum-s)+1);
                ans.add(i+1);
                return ans;
            }
            map.put(sum,i+1);
        }
        return new ArrayList<>(Arrays.asList(-1));
        // code here
    }
}
