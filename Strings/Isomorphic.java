class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2)return false;
        //creating  a map for mapping thw char to character
        Map<Character,Character>cmap=new HashMap<>();
        for(int i=0;i<n1;i++)
        {
char original=s.charAt(i);
char replacement=t.charAt(i);
        
        if(!cmap.containsKey(original))
        {
            if(!cmap.containsValue(replacement))
            {
                cmap.put(original,replacement);
            }
            else
            {
                return false;
            }
        }
        else
        {
            char ch=cmap.get(original);
            if(ch!=replacement)return false;
        }
        }
        return true;

        
    }
        
}
