class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        Node temp1=head;
        while(temp1!=null)
        {
            Node temp2=temp1.next;
            while(temp2!=null&&temp1.data+temp2.data<=target)
            {
                if(temp1.data+temp2.data==target)
                {
                     ArrayList<Integer>pair=new ArrayList<>();
                   pair.add(temp1.data);
                   pair.add(temp2.data);
                   ans.add(pair);
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return ans;
        
    }
  Tc:O(N2)
  sc:O(1)

  Optimal approach
  TC:O(N)
  Sc:O(1)


  class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        Node tail=head;
       while(tail.next!=null)
       {
           tail=tail.next;
       }
       Node temp1=head;
      
      while (temp1 != null && tail != null && temp1 != tail && temp1 != tail.next)
       {
           int sum=temp1.data+tail.data;
           if(sum==target)
           {
              ArrayList<Integer>pair=new ArrayList<>();
              pair.add(temp1.data);
              pair.add(tail.data);
              ans.add(pair);
              tail=tail.prev;
              temp1=temp1.next;
           }
           else if(sum>target)
           {
tail=tail.prev;
           }
           else
           {
               temp1=temp1.next;
           }
       }
       return ans;
        
    }
}
        
