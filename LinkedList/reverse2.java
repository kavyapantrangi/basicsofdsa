class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
      
        ListNode dummy = new ListNode(0);
        dummy.next = head;

       
        ListNode leftpre = dummy;
        for (int i = 0; i < left - 1; i++) {
            leftpre = leftpre.next;
        }

        
        ListNode current = leftpre.next;
        ListNode prenode = null;
        ListNode sublistTail = current;  

        
        for (int i = 0; i <= right - left; i++) {
            ListNode nextnode = current.next;
            current.next = prenode;
            prenode = current;
            current = nextnode;
        }

       
        leftpre.next = prenode;         
        sublistTail.next = current;     

        return dummy.next;
    }
}
