class Solution {
    public int numDecodings(String s) {
        if(s.length()==0 ||s.charAt(0)=='0')
        {
            return 0;
        }
        //setting a dp array of size n+1
        int n=s.length();
        int[]dp=new int[n+1];
        //intilize the dp[0]&1 with 1 becoz if length=1 or empty we can decode it with only one way
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++)
        {
            int oneDigit=s.charAt(i-1)-'0';
            int twoDigits=Integer.parseInt(s.substring(i-2,i));
            if(oneDigit!=0)
            {
                dp[i]+=dp[i-1];

            }
            if(10<=twoDigits&&twoDigits<=26)
            {
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
