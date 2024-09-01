class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
       
       char c1=coordinate1.charAt(0);
       int k1=coordinate1.charAt(1)-'0';
       char c2=coordinate2.charAt(0);
       int k2=coordinate2.charAt(1)-'0';


int sum1=(c1-'a')+k1;
int sum2=(c2-'a')+k2;
if(sum1%2==sum2%2)return true;
return false;

