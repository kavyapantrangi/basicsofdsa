
class Solution {
    int getMiddle(Node head) {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
            
        }
        int val=count/2;
        if(count/2==0)
        {
            val=count/2+1;
        }
        Node curr=head;
        int i=0;
        while(i<val)
        {
            i++;
            curr=curr.next;
        }
        return curr.data;
        // Your code here.
    }
}
