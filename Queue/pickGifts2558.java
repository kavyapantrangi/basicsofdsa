class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:gifts)
        {
            maxheap.add(val);
        }
            for(int i=0;i<k&&maxheap.peek()>1;i++)
            {
                int x= maxheap.poll();
                maxheap.add((int)Math.sqrt(x));

                
            }
            long sum=0;
            for(int val:maxheap)
            {
                sum+=val;
            }

        return sum;
    }
}
