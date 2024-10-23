Approach1:
class Solution {
    public int beautySum(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            Map<Character,Integer>map=new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int val:map.values())
                {
                    min=Math.min(min,val);
                    max=Math.max(max,val);
                }
                count+=max-min;
            }
        }
        return count;
        
    }
}

Approach2:
class Solution {
    public int beautySum(String s) {
        int count=0;
        int n=s.length();
        char []chars=s.toCharArray();
        for(int i=0;i<n;i++)
        {
            int[]freq=new int[26];
            for(int j=i;j<n;j++)
            {
                freq[chars[j]-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int f:freq)
                {
                    if(f>0)
                    {
                        max=Math.max(max,f);
                        min=Math.min(min,f);
                    }
                }
                count+=max-min;
            }
        }
        return count;
    }
}
