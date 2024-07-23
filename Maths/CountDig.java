Q:Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.
class Solution{
    static int evenlyDivides(int N){
        int count=0;
        int dig=N;
        while(N>0)
        {
            int last=N%10;
            if(last!=0&&dig%last==0)
            {
            count++;
            }
            N=N/10;
        }
        return count;
        // code here
    }
}
