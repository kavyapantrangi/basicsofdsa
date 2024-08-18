class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            int l=0;
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)=='1')c++;
                else if(s.charAt(j)=='0')
                l++;
                if(c<=k||l<=k) count++;
            }
        }
        return count;
        
    }
}
