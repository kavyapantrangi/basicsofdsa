class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int currSum=0;
        Map<Integer,Integer> mp = new HashMap();
        ArrayList<Integer> ans = new ArrayList();
        mp.put(0, -1);
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum==target)
            {
                ans.add(1);
                ans.add(i+1);
                return ans;
                
            }
            if(mp.containsKey(currSum-target)){
                ans.add(mp.get(currSum-target)+2);
                ans.add(i+1);
                return ans;
            }
            else {
                mp.put(currSum, i);
            }
        }
        ans.add(-1);
        return ans;
    }
}
