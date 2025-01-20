class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node temp1=head1;
        Node temp2=head2;
        Node dummy=new Node(0);
        Node newHead=dummy;
        while(temp1!=null&&temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                dummy.next=temp1;
                temp1=temp1.next;
                
            }
            else
            {
                dummy.next=temp2;
                temp2=temp2.next;
            }
            dummy=dummy.next;
        }
        if(temp1==null)
        {
            dummy.next=temp2;
        }
        if(temp2==null)
        {
            dummy.next=temp1;
        }
        return newHead.next;
        
    }
    
}
