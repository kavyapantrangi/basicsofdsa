
//without recursion

class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        List<Integer>list=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        while(!s.isEmpty())
        {
            list.add(s.peek());
            s.pop();
        }
        Collections.sort(list);
        // Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<list.size();i++)
        {
            st.push(list.get(i));
            
        }
        return st;
        
        // add code here.
    }
}



//using recursion
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        
        if(s.size()<=1)return s;
        int top=s.pop();
        sort(s);
        insertInSort(s,top);
        return s;
       
    }
    public void insertInSort(Stack<Integer>s,int ele)
    {
        if(s.isEmpty()||s.peek()<ele)
        {
            s.push(ele);
            return ;
            
        }
        int top=s.pop();
        insertInSort(s,ele);
        s.push(top);
    }
}

