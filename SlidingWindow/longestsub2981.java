class Solution {
    public int maximumLength(String s) {
        int maxlength=-1;
        int n=s.length();
        for(int len=1;len<=n;len++)
        {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<=n-len;i++)
        {
            String sub=s.substring(i,i+len);
            
        if(isSpecial(sub))  
        {
            map.put(sub,map.getOrDefault(sub,0)+1);
        }
        } 
        for(String k:map.keySet())
        {
            if(map.get(k)>=3)
            {
                maxlength=Math.max(maxlength,len);
            
            }
            }
        }
        return maxlength;
    }
    

    public boolean isSpecial(String s)
    {
        char first=s.charAt(0);
        for (char c:s.toCharArray())
        {
            if(first!=c)return false;
        }
    return true;
    }

}
