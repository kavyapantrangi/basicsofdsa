BruteForce Approach:


  class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer>stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(temp.val!=stack.peek())
            {
                return false;
            }
            temp=temp.next;
            stack.pop();
        }
        return true;
        
    }
}
Optimal approach:
  class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //finding middle 
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //reversing the half from the middle of the linkedlist
        ListNode newnode=reverse(slow.next);
        ListNode first=head;
        ListNode second=newnode;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                reverse(newnode);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newnode);
        return true;
    }
    public ListNode reverse(ListNode head)
    {
if(head==null||head.next==null)
{
    return head;
}
ListNode newNode=reverse(head.next);
ListNode first=head.next;
first.next=head;
head.next=null;
return newNode;
    }
}
