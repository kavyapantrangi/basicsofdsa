class Solution {
    public String longestCommonPrefix(String[] strs) {
        //sort the array
        Arrays.sort(strs);
        StringBuilder a=new  StringBuilder();
        int n=strs.length;
        char[]first=strs[0].toCharArray();
        char[]last=strs[n-1].toCharArray();
        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
            break;
            a.append(first[i]);
        }
        return a.toString();
    }
}
