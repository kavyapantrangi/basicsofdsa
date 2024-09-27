/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)return null;
        if(head.next==null)
        return head;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode point=dummy;
        while(point.next!=null&&point.next.next!=null)
        {
        //identify the node to swap
        ListNode swap1=point.next;
        ListNode swap2=point.next.next;
//swapping
swap1.next=swap2.next;
swap2.next=swap1;
point.next=swap2;
point=swap1;



        }
       
        return dummy.next;
    }
}
