class Solution {
    public List<Integer> getRow(int n) {
        // List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        // firstRow.add()
        long c=1;
       for(int i=0;i<=n;i++)
       {
        ans.add((int)c);
        c=c*(n-i)/(i+1);
        

       }
        return ans;
    }
  
}
