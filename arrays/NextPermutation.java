class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        
        // Find the first decreasing element
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        
        // If no such element exists, the array is in descending order
        if (index == -1) {
            reverse(0, n - 1, nums); // Reverse the entire array
            return; // Return early since no further swapping is needed
        }
        
        // Find the element just larger than nums[index] to swap with
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        
        // Reverse the sequence after the index to get the next smallest permutation
        reverse(index + 1, n - 1, nums);
    }
    
    // Helper function to reverse an array
    public void reverse(int i, int j, int[] arr) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
