By Using hashset:
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>res=new HashSet<>();
        while(n!=1&&!res.contains(n))
        {
            res.add(n);
            n=getNext(n);
        }
     return n==1;
     
        
    }
    public int  getNext(int n)
    {
        int ans=0;
        while(n>0)
        {
            int digit=n%10;
ans+=digit*digit;
n=n/10;
        }
        return ans;
    }
}

//optimal solution:
lass Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>res=new HashSet<>();
        int slow=n;
        int fast=getNext(n);
        while(fast!=1&&slow!=fast)
        {
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        return fast==1;    
    }
    public int  getNext(int n)
    {
        int ans=0;
        while(n>0)
        {
            int digit=n%10;
ans+=digit*digit;
n=n/10;
        }
        return ans;
    }
}
