class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        
        
        Stack<Character>st=new Stack<>();
        String res="";
        int n=exp.length();
        for(int i=0;i<n;i++)
        {
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                res+=ch;
            }
            else if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                while(st.isEmpty()&&st.peek()!='(')
                {
                    res+=st.peek();
                    st.pop();
                    
                }
                st.pop();
            }
            else
            {
                while (!st.isEmpty() && prec(ch) <=
          prec(st.peek())) {

          res += st.pop();
        }
        st.push(ch);
      }
            }
            while (!st.isEmpty()) {
    //   if (st.peek() == '(')
    //     return "Invalid Expression";
      res += st.pop();
    }
    return res;
        }
        
    
    
    
    //to identify the priority if the opeartor
    static int prec(char ch)
    {
       switch(ch)
       {
          case '+':
          case '-':
              return 1;
          case '*':
          case '/':
              return 2;
          case '^':
              return 3;
         
       }
        return -1;
        
        
        
    }
}
