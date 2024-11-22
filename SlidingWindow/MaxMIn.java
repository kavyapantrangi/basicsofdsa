class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int maxI = 0;
        int minI = 0;

        // Find the indices of the maximum and minimum elements
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxI = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                minI = i;
            }
        }

        // Calculate deletions for various scenarios
        int leftDeletions = Math.max(minI, maxI) + 1; // Deleting from the left
        int rightDeletions = Math.max(n - minI, n - maxI); // Deleting from the right
        int mixedDeletions = Math.min(minI, maxI) + 1 + (n - Math.max(minI, maxI)); // Left for one, right for the other

        // Return the minimum deletions among the scenarios
        return Math.min(leftDeletions, Math.min(rightDeletions, mixedDeletions));
    }
}
