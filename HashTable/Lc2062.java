class Solution {
    public int countVowelSubstrings(String word) {
        int ans=0;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            Map<Character,Integer>cnt=new HashMap<>();
            for(int j=i;j<n&&isVowel(word.charAt(j));j++)
            {
                cnt.put(word.charAt(j),cnt.getOrDefault(word.charAt(j),0)+1);
                if(cnt.size()==5)ans++;
            }
        }
return ans;
        
    }
    private boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
