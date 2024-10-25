Bruteforce Approach:
  class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
            int []hash=new int[26];
            int maxf=0;
            for(int j=i;j<n;j++)
            {
                hash[s.charAt(j)-'A']++;
                maxf=Math.max(maxf,hash[s.charAt(j)-'A']);
                int changes=(j-i+1)-maxf;
                if(changes<=k)
                {
                    maxlen=Math.max(maxlen,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        return maxlen;
        
    }
}
Tc:O(n2)
  SC:O(26)

  optimal approach :


class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxlen=0;
       int l=0;
       int r=0;
       int maxf=0;
       int[]hash=new int[26];
       while(r<n)
       {
        hash[s.charAt(r)-'A']++;
        maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
        while(((r-l+1)-maxf)>k)
        {
            hash[s.charAt(l)-'A']--;
            maxf=0;
            for(int i=0;i<25;i++)
            {
                maxf=Math.max(maxf,hash[i]);
            }
            l++;
        }
        if(((r-l+1)-maxf)<=k)
        {
            maxlen=Math.max(maxlen,r-l+1);
        }
        r++;
       }
       return maxlen;
    }

}
Tc:O(n)
  sc:O(26)
}
