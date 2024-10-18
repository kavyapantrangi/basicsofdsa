public class Solution
{
    public static Node deleteLastNode(Node head) {
        if(head==null||head.next==null)return null;
        // Write your code here
        Node tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        Node newTail=tail.prev;
        newTail.next=null;
        tail.prev=null;
        return head;
    }
}
