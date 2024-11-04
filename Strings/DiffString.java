class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.isEmpty() && map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return t.charAt(i);
            }
            else{
                int a = map.get(t.charAt(i));
                a--;
                if(a==0){
                    map.remove(t.charAt(i));
                }
                else{
                    map.put(t.charAt(i),a);
                }
            }
        }
        return '!';
    }
}
