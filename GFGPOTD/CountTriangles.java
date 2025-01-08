class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        Arrays.sort(arr);
        
        
        int count=0;
        for(int i=n-1;i>=2;i--)
        
        {
            int start=0;
        int end=i-1;
        
            while(start<end)
            {
                int sum=arr[start]+arr[end];
                if(sum>arr[i])
                {
                    count+=(end-start);
                    end--;
                }
                // if(sum<arr[i])start++;
                else start++;
            }
        
            
        }
        return count;
    }
}
