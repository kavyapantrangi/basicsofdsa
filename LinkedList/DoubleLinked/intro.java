class Solution {
    Node constructDLL(int arr[]) {
        int n=arr.length;
        if(arr==null||n==0)
        {
            return null;
        }
        Node head=new Node(arr[0]);
        Node prev=null;
        Node curr=head;
        for(int i=1;i<n;i++)
        {
            curr.next=new Node(arr[i]);
            curr.next.prev=curr;
            curr=curr.next;
        }
        return head;
        // Code here
    }
}
