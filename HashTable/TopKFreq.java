class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //usig priority queue
        if(nums.length==k)
        {
            return nums;

        }
        //storing the freq
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //adding it into the priorityqueue by the freq order
        Queue<Integer>queue=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        int[]ans=new int[k];
        int j=0;
        for(int i:map.keySet())
        {
            queue.add(i);
            if(queue.size()>k)
            {
                queue.poll();
            }
        }
        for(int i=0;i<k;i++)
        {
ans[i]=queue.poll();
        }

return ans;
       
    }
}
