class Solution {
    public int maxDepth(String s) {
        int count=0;
        int n=s.length();
        int i=0;
        int max=0;
        while(i<n)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
            max=Math.max(count,max);
            i++;
        }
return max;
        
    }
}
