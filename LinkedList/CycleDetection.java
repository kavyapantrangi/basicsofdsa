BruteForce Approah:
    public class Solution {
    public boolean hasCycle(ListNode head) {
       
        Map<ListNode,Integer>map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(map.containsKey(temp))return true;
            else
            {
                map.put(temp,1);
            }
            temp=temp.next;
        }
        return false;
    }
}


Optimal Approach:
public class Solution {
    public boolean hasCycle(ListNode head) {
       
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
}
