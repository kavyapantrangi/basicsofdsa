class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n==0)return false;
        while(n>0)
        {
            if(n==1)return true;
            if(n%2!=0)break;
            n/=2;
        }
        return false;
        
    }
}
//bitmagic
class Solution {
    public static boolean isPowerofTwo(long N) {
        // code here
        if((N&(N-1))==0)
        {
            return true;
        }
        return false;
    }
}
