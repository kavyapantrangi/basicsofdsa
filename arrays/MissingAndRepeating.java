class Solve {
    int[] findTwoElement(int arr[], int n) {
        Map<Integer,Integer>map=new HashMap<>();
        int[]ans=new int[2];
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }
      int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int sum1=0;
        for(int i=1;i<=n;i++)
        {
            sum1+=i;
        }
        for(int i:map.keySet())
        {
            if(map.get(i)>=2)
            {
                ans[0]=i;
                break;
            }
        }
        ans[1]=(sum1-sum)+ans[0];
        return ans;
       
        
    }
}
