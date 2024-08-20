class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums1.length;
int n1=nums2.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<n1;i++)
        {
            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0)
            {
                ans.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[]a=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            a[i]=ans.get(i);
        }
        Arrays.sort(a);
        return a;
        
    }
}
