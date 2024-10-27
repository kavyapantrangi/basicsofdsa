class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        int pos=1;
        if(n==0)
        {
            return 0;
        }
        while((n&1)==0)
        {
            n=n>>1;
            pos++;
        }
        return pos;
            
        // Your code here
            
    }
}
