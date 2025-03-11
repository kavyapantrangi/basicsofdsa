class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[]chars=new int[26];
        char c='a';
        for(int i=0;i<s.length();i++)
        {
            chars[s.charAt(i)-'a']++;
        }
int freq=0;
for(int count:chars)
{
    if(count>0)
    {
        freq=count;
        break;
    }
}
for(int count:chars)
{
    if(count>0&&count!=freq)
    {
        return false;
    }
}
return true;
    }
}
