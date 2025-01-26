Class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        Node prev1=null;
        while(fast!=null&&fast.next!=null){
            prev1=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        if(fast!=slow){
            // System.out.println("true");
            return;
        }
        if(head==slow){
            prev1.next=null;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=slow){
            temp=temp.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
    }
}
