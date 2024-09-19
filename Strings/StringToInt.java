class Solution {
    public int myAtoi(String s) {
        int len=s.length();
        if(len==0)return 0;
        //to trvaerse trough each char
        int index=0;
        //to skip whitespaces
        while(index<len&&s.charAt(index)==' ')
        {
            index++;
        }
        boolean neg=false;
        //to handle the signs
        if(index<len)
        {
            if(s.charAt(index)=='-')

            {
                neg=true;
                index++;
            }
            else if(s.charAt(index)=='+')index++;
        }
        int result=0;
        while(index<len&&isDigit(s.charAt(index)))
        {
        int digit=s.charAt(index)-'0';
        if(result>(Integer.MAX_VALUE/10)||(result==(Integer.MAX_VALUE)/10&&digit>7))
        {
            return neg?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        result=(result*10)+digit;
        index++;
    }
    return neg?-result:result;
}
private boolean isDigit(char ch)
{
    return ch>='0'&&ch<='9';
    }
}
