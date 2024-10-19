class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int key:map.keySet())
        {
            maxHeap.add(key);
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=maxHeap.poll();
        }
        return ans;
    }
}


Optimal Approach:
  class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[]freq=new ArrayList[nums.length+1];
       for(int i=0;i<freq.length;i++)
       {
        freq[i]=new ArrayList<>();
       }
       for(Map.Entry<Integer,Integer>entry:map.entrySet())
       {
        int frequency=entry.getValue();
freq[frequency].add(entry.getKey());  
     }
     int[]res=new int[k];
     int indx=0;
     for(int i=freq.length-1;i>=0;i--)
     {
        for(int num:freq[i])
        {
            res[indx++]=num;
            if(indx==k)
            {
                return res;
            }
        }
     }
     return new int[0];
    }
}
