class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>map=new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    int i=s.length()-1;
    int ans=0;
    while(i>0)
    {
        int curr=map.get(s.charAt(i));
        int prev=map.get(s.charAt(i-1));
        if(i!=0&&prev<curr)
        {
        
ans+=curr-prev;
i=i-2;
        }
        else
        {
        ans+=curr;
        i--;
        }
    }
    if(i==0)
    ans+=map.get(s.charAt(0));
    
    return ans;
        
    }
}
