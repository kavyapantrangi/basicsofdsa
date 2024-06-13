class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String[]arr=S.split("\\.");
        StringBuilder s=new StringBuilder();
       for(int i=arr.length-1;i>=0;i--)
       {
           s.append(arr[i]);
           if(i!=0)
           {
           s.append(".");
           }
       }
       return s.toString().trim();
    }
}
