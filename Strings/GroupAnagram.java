class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)return new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        int n=strs.length;
        for(String str:strs)
        {
            String mapp=getFrequency(str);
            
            if(map.containsKey(mapp))
            {
              map.get(mapp).add(str);
            }
            else
            {
                List<String>listOfAll=new ArrayList<>();
                listOfAll.add(str);
                map.put(mapp,listOfAll);
            }
        }
        return new ArrayList<>(map.values());
    }
        //function to return thefrequency of string
        private String getFrequency(String s)
        {

int[]freq=new int[26];
for(char c:s.toCharArray())
{
freq[c-'a']++;
}
StringBuilder frequency=new StringBuilder();
char ch='a';
for(int i:freq)

{
    frequency.append(ch);
    frequency.append(i);
    ch++;
}
return frequency.toString();
        
    }
}
