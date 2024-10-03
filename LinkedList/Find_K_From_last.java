class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        int cnt=0;
        Node temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
        int i=0;
        if(k>cnt)
        {
            return -1;
        }
        Node curr=head;
        while(i<cnt-k)
        {
           curr=curr.next; 
           i++;
        }
        return curr.data;
        // Your code here
    }
}
