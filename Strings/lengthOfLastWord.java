class Solution {
    public int lengthOfLastWord(String s) {
       
        int count=0;
        String b=s.trim();
         int i=b.length()-1;
        while(i>=0&&b.charAt(i)!=' ')
        {
count++;
i--;
        }
        return count;
        
    }
}
