using stack :
  class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        Stack<Integer>st=new Stack<>();
        DLLNode temp=head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null&&!st.empty())
        {
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
    }
}
TC :O(n)
  Sc:O(n)

Optimal approach:
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
       DLLNode prev=null;
        DLLNode curr=head;
        DLLNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
Tc:O(n)
  sc:O(1)


  
