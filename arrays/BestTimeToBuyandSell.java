Bruteforce Approach:
  class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                max=Math.max(prices[j]-prices[i],max);
            }
        }
        return max;
        
    }
}


//optimal 
Tc:O(n)
Space:O(1)
  class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {

min=Math.min(min,prices[i]);
    max=Math.max(prices[i]-min,max);
}

        return max;
    }
}
