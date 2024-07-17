class Solution {
    public int print2largest(List<Integer> arr) {
        int n=arr.size();
        int max1=-1;
        int max2=-1;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)>max1)
            {
                max2=max1;
                max1=arr.get(i);
                
            }
         else   if(arr.get(i)>max2&&arr.get(i)!=max1)
            {
                max2=arr.get(i);
            }
        }
        return max2;
        // Code Here
    }
}
