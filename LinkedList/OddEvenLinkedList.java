class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode curr=new ListNode();
       
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
       ListNode odd=head;
       ListNode even=head.next;
       //to maintain even head
       ListNode evenHead=even;
       while(even!=null&&even.next!=null)
       {
        odd.next=odd.next.next;
        odd=odd.next;
        even.next=even.next.next;
        even=even.next;

       }
       odd.next=evenHead;
       return head;
    }
}
