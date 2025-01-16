By using extra array to store the frequency of each element
  class Solution {
    public int maxLen(int[] arr) {
        int max=0;
        int n=arr.length;
        Map<Integer,Integer>map=new HashMap<>();
       int sum=0;
       map.put(0,-1);
       for(int i=0;i<n;i++)
       {
           sum+=(arr[i]==0)?-1:1;
           if(map.containsKey(sum))
           {
               max=Math.max(max,i-map.get(sum));
           }
           else
           {
           map.put(sum,i);
           }
       }
       return max;
    }
}
