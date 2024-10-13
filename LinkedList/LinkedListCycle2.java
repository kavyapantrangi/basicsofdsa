BruteForce:
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode temp=head;
        Map<ListNode,Integer>map=new HashMap<>();
        
        while(temp!=null)
        {
           if(map.containsKey(temp))
           {
            return temp;
           }
           else
           {
            map.put(temp,1);
           }
           temp=temp.next;
        }
        return null;
    }
}

Optimal Approach:
  
  public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null&&fast.next!=null)
      {
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow)
        {
           slow=head;
           while(slow!=fast)
           {
            slow=slow.next;
            fast=fast.next;
           }
           return slow;
        }
      }
        return null;
    }
}
  


