public static int lenOfLongSubarr (int A[], int N, int K) {
        Map<Integer,Integer>map=new HashMap<>();
        // map.put(0,0);
        int max=0;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+A[i];
            if(sum==K)
            {
                max=Math.max(i+1,max);
            }
            if(map.containsKey(sum-K))
            {
                max=Math.max(max,i-map.get(sum-K));
            }
           if(!map.containsKey(sum))
           {
            map.put(sum,i);
           }
            
        }
        return max;
        //Complete the function
    }
    
    
}


