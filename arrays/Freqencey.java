//link:https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1?page=1&category=Arrays&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int P) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=map.getOrDefault(i+1,0);
        }
        // do modify in the given array
    }
}
