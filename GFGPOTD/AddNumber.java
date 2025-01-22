class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        while(num1!=null&&num1.data==0)num1=num1.next;
        while(num2!=null&&num2.data==0)num2=num2.next;
        if(num1==null&&num2==null)return new Node(0);
        
        num1=reverse(num1);
        num2=reverse(num2);
       Node ans=new Node(-1),cur=ans;
       int carry=0;
       while(num1!=null&&num2!=null)
       {
           int total=num1.data+num2.data+carry;
           cur.next=new Node(total%10);
           carry=total/10;
           cur=cur.next;
           num1=num1.next;
           num2=num2.next;
       }
       while(num1!=null)
       {
           int total=num1.data+carry;
           cur.next=new Node(total%10);
           carry=total/10;
           cur=cur.next;
           num1=num1.next;
           
           
       }
        while(num2!=null)
       {
           int total=num2.data+carry;
           cur.next=new Node(total%10);
           carry=total/10;
           cur=cur.next;
           num2=num2.next;
           
           
       }
       if(carry>0)
       
       {
           cur.next=new Node(carry);
           
       }
       return reverse(ans.next);
       
    }
    
    public static Node reverse(Node head)
    {
        if(head==null||head.next==null)return head;
        Node temp=head;
        Node prev=null;
        // Node next=null;
        while(temp!=null)
        {
            
           Node next=temp.next;
             temp.next=prev;
            prev=temp;
           
            temp=next;
        }
        head=prev;
        return head;
    }
}
