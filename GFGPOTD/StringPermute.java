class Solution {
    public ArrayList<String> findPermutation(String s) {
        Set<String>unique=new HashSet<>();
        permute(s,"",unique);
        ArrayList<String>result=new ArrayList<>(unique);
        return result;
        
        // Code here
    }
    private void permute(String s,String prefix,Set<String>unique)
    {
        if(s.length()==0)
        {
            unique.add(prefix);
            return ;
        }
        for(int i=0;i<s.length();i++)
        {
            char current=s.charAt(i);
            String remaining=s.substring(0,i)+s.substring(i+1);
            permute(remaining,prefix+current,unique);
        }
    }
}
