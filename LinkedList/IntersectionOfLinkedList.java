Bruteforce:
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode>hash=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null)
        {
            hash.add(temp);
            temp=temp.next;
        }
        while(headB!=null)
        {
            if(hash.contains(headB))
            {
                return headB;
            }
            headB=headB.next;
        }
        return null;
        
    }
}



optimal approach:
  public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0;
        int len2=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null)
        {
            len1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            len2++;
            temp2=temp2.next;
        }
        //if linkedlist A is larger than B then we have to move until its length is equal to linkedlist B
        while(len1>len2)
        {
            len1--;
            headA=headA.next;
        }
        //if linkedlist B is larger than A then we have to move until its length is equal to linkedlist A
        while(len2>len1)
        {
            len2--;
            headB=headB.next;
        }
while(headA!=headB)
{
    headA=headA.next;
    headB=headB.next;
}
return headA;


        
    }
}
  
