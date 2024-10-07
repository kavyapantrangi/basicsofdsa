BruteForce Approach:
  class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int n=0;
        ListNode temp=head;
        if(head.next==null||head==null)
        {
            return null;
        }
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        int res=n/2;
        temp=head;
        while(temp!=null)
        {
            res--;
            if(res==0)
            {
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
        
    }
}

optimal Approach:
  class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)
        {
            return null;
        }
       ListNode slow=head;
       ListNode fast=head;
       fast=head.next.next;
       while(fast!=null&&fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;

       }
       if(slow.next!=null)
       {
        slow.next=slow.next.next;
       }
        return head;
    }
}
