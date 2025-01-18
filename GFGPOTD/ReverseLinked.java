class Solution {
    Node reverseList(Node head) {
        Node temp=head;
        Node prev=null;
        if(head==null ||head.next==null)
        {
            return head;
        }
        while(temp!=null)
        {
            Node next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            
            
        }
        head=prev;
        return head;
        
        // code here
    }
}
