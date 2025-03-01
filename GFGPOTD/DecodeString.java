class Solution {
    static String decodeString(String s) {
        int len=s.length();
        // String answer="";
        //create  a number stack
        //create a string stack
        Stack<Integer>st=new Stack<>();
        Stack<String>st1=new Stack<>();
        int k=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                k=k*10+(c-'0');
                continue;
            }
            if(c=='[')
            {
                st.push(k);
                k=0;
                st1.push(String.valueOf(c));
                continue;
            }
            if(c!=']')
            {
                st1.push(String.valueOf(c));
                continue;
            }
        
        StringBuilder temp = new StringBuilder();
      while (!st1.peek().equals("["))
        temp.insert(0, st1.pop());

      // remove the "["
      st1.pop();
        StringBuilder replace=new StringBuilder();
        int count=st.pop();
        for(int i=0;i<count;i++)
        {
            replace.append(temp);
           
        }
         st1.push(replace.toString());
        }
        // StringBuilder res=new StringBuilder();
          StringBuilder result = new StringBuilder();
    while (!st1.empty()) {
      result.insert(0, st1.pop());
    }
    return result.toString();
        
        // code here
    }
}
