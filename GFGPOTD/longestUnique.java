class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n=s.length();
        int st=0;
        int max=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
          char ch=s.charAt(i);
          if(map.containsKey(ch))
          {
              st=Math.max(st,map.get(ch)+1);
          }
          map.put(ch,i);
          max=Math.max(max,i-st+1);
        }
      
      return max;
        
        
    }
}
