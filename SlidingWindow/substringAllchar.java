class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int count=0;
        while(r<s.length())
        {
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3&&l<=r)
            {
                count+=s.length()-r;
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0)
                {
                    map.remove(left);
                }
                l++;
            }
            r++;

        }
return count;
        
    }
}
