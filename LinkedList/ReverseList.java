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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
       ListNode previousNode=null;
        ListNode currentNode=head;

        while(currentNode!=null)
        {
            ListNode nextNode=currentNode.next;

currentNode.next=previousNode;
previousNode=currentNode;
currentNode=nextNode;
        }
head=previousNode;
        return head;
        
    }
}
