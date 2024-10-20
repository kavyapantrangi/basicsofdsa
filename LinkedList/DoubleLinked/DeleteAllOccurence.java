class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                if(temp==head)
                {
                    head=head.next;
                }
                Node nextNode=temp.next;
                Node prevNode=temp.prev;
                if(nextNode!=null)nextNode.prev=prevNode;
                if(prevNode!=null)prevNode.next=nextNode;
            }
                temp=temp.next;
            
        }
        return head;
        // Write your code here
    }
}
