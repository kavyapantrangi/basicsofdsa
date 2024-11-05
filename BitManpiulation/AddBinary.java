class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0||j>=0||carry==1)
        {
            int total=carry;
            if(i>=0)total+=a.charAt(i)-'0';
            if(j>=0)total+=b.charAt(j)-'0';
            i--;
            j--;
            ans.append(total%2);
            carry=total/2;
        }
return ans.reverse().toString();
        
    }
}
