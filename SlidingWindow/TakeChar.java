class Solution {
    public int takeCharacters(String s, int k) {
        
        int n=s.length();
        int a=0,b=0,c=0;
        int l=0,r=0;
        int ans=n;
        int Ta=0,Tb=0,Tc=0;
        //counting all the occurenecs
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')Ta++;
          else  if(ch=='b')Tb++;
          else  if(ch=='c')Tc++;
            
        }
        //if in anycase there is any alphabet is not meeting k times
        if(Ta<k||Tb<k||Tc<k)
        {
            return -1;
        }


        while(r<n)
        {
            if(s.charAt(r)=='a')a++;
            if(s.charAt(r)=='b')b++;
            if(s.charAt(r)=='c')c++;
            r++;
while(a>Ta-k||b>Tb-k||c>Tc-k)
{
    if(s.charAt(l)=='a')a--;
    
    if(s.charAt(l)=='b')b--;
    
    if(s.charAt(l)=='c')c--;
    l++;
}
ans=Math.min(ans,n-(r-l));
        }
        return ans;
    }
}
https://leetcode.com/problems/take-k-of-each-character-from-left-and-right/description/?envType=daily-question&envId=2024-11-20
