Bruteforce:
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int count=0;
       ListNode temp=head;
       if(head.next==null ||head==null)return null;
       while(temp!=null)
       {
        count++;
        temp=temp.next;
       }
       if(count==n)
       {
        return head.next; 
       }
       temp=head;

       int res=count-n;
       while(temp!=null)
       {
        res--;
        if(res==0)
        {
            temp.next=temp.next.next;
        }
       temp= temp.next;
       }
        return head;
    }
}













Optimal approach:
  class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int count=0;
       ListNode temp=head;
       ListNode fast=head;
       ListNode slow=head;
       for(int i=0;i<n;i++)
       {
        fast=fast.next;
       }
       if(fast==null)return head.next;
       while(fast.next!=null)
       {
        fast=fast.next;
        slow=slow.next;
       }
       slow.next=slow.next.next;
       return head;
      
    }
}
