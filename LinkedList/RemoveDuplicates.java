class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null||head.next==null)return head;
       ListNode temp=head;
       while(temp.next!=null)
       {
        if(temp.next.val==temp.val)
        {
            temp.next=temp.next.next;
        }
        else
        {
            temp=temp.next;
        }
       }
        return head;
    }
}
