class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode greaterList=new ListNode(0);
        ListNode lesserList=new ListNode(0);
        ListNode less=lesserList;
        ListNode great=greaterList;
        while(head!=null)
        {
            if(head.val<x)
            {
                less.next=head;
                less=less.next;
            }
            else
            {
                great.next=head;
                great=great.next;
            }
            head=head.next;
        }
        great.next=null;
        less.next=greaterList.next;
        return lesserList.next;
    }
}
