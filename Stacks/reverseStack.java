class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.size()<=1)
        {
            return ;
        }
        int top=s.pop();
        reverse(s);
        insert(s,top);
    }
    public static Stack<Integer>insert(Stack<Integer>s,int ele)
    {
        if(s.isEmpty())
        {
            s.push(ele);
            return s;
        }
        int top=s.pop();
        
    insert(s,ele);
    s.push(top);
    return s;
    }
}
