Bruteforce approach:
  class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer>list=new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        temp=head;
       int i=0;
       while(i<list.size())
       {
        temp.val=list.get(i++);
        temp=temp.next;
       }
       return head;

    }
}
Tc:O(n)+O(nlogn)+o(n)
sc:O(n)


  optimal approach:
class Solution {
    public ListNode sortList(ListNode head) {


if(head==null||head.next==null)
{
    return head;
}
ListNode left=head;
ListNode middle=middle(head);
ListNode right=middle.next;
middle.next=null;
left=sortList(left);
right=sortList(right);
return merge(left,right);





    }
        //merge function
        ListNode merge(ListNode head1,ListNode head2)
        {
            ListNode dummy=new ListNode(-1);
            ListNode temp=dummy;
            while(head1!=null&&head2!=null)
            {
                if(head1.val<=head2.val)
                {
                    temp.next=head1;
                    head1=head1.next;
                }
                else
                {
                    temp.next=head2;
                    head2=head2.next;
                }
                temp=temp.next;
            }
            if(head1!=null)
            {
                temp.next=head1;
            }
            else
            {
                temp.next=head2;
            }
            return dummy.next;
        }
        //midlle of the linkedlist;

ListNode middle(ListNode head)
{
    if(head==null||head.next==null)
    {
        return null;
    }
    ListNode slow=head;
    ListNode fast=head;
    fast=fast.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

    }
