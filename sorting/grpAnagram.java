class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)return new ArrayList<>();
        Map<String,List<String>>anagramMap=new HashMap<>();
        for(String s:strs)
        {
            char[]charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sortstr=new String(charArray);
            if(!anagramMap.containsKey(sortstr))

{
    anagramMap.put(sortstr,new ArrayList<>());
}  
anagramMap.get(sortstr).add(s);      }
return new ArrayList<>(anagramMap.values());
        
    }
}
