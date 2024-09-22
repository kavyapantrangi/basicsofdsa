class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Arrays.sort(message);
        Arrays.sort(bannedWords);
        int count=0;
        Set<String>set=new HashSet<>();
        for(int i=0;i<bannedWords.length;i++ )
        {
           set.add(bannedWords[i]);
        }
        for(int i=0;i<message.length;i++)
        {
            if(set.contains(message[i]))count++;
        }
        return count>=2;
            }
}
