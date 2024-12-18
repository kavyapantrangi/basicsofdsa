
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

