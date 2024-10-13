lass Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        //finding the length of linkedlist
int len=1;
ListNode temp=head;
while(temp.next!=null)
{
    len++;
    temp=temp.next;
}
temp.next=head;
k=k%len;
int rem=len-k;
//linking the last node to head;

temp=head;
while(temp!=null)
{
   rem--;
    if(rem==0)
    {
       head= temp.next;
       temp.next=null;
    }
    temp=temp.next;
     
}
      return head;  
    }
}
