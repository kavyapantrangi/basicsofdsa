
class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        int i=0;
        int j=i+1;
        int n=arr.size();
        int max=Integer.MIN_VALUE;
        while(i<n&&j<n)
        {
            max=Math.max(arr.get(i)+arr.get(j),max);
            i++;
            j++;
        }
        return max;
        // Your code goes here
    }
}
