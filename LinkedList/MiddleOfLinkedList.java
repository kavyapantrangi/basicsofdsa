class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null)return head;
        int cnt=0;
       ListNode temp=head;
        while(temp!=null)
        {
            cnt++;
            temp=temp.next;
        }
int start=cnt/2;
int i=0;
ListNode temp2=head;
while(temp2!=null)
{
temp2=temp2.next;
i++;
if(i==start)return temp2;
} 
return temp2;
        
    }
}
