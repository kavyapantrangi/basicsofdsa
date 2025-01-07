class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
    //   int i=0;
      int n=arr.length;
      int j=0;
      for(int i=1;i<n;i++)
      {
          if(arr[i]==arr[i-1])
          {
              continue;
          }
          else
          {
              j++;
              arr[j]=arr[i];
          }
      }
      return j+1;
        // Code Here
    }
}
