class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length < 2) {
            return result; 
        }

        Arrays.sort(arr); 
        int n = arr.length;
        int i = 0, j = n - 1;
        int closestDiff = Integer.MAX_VALUE; 
        int maxAbsDiff = Integer.MIN_VALUE; 

        while (i < j) {
            int sum = arr[i] + arr[j];
            int currentDiff = Math.abs(sum - target);
            int absDiff = Math.abs(arr[j] - arr[i]);

            if (currentDiff < closestDiff || 
               (currentDiff == closestDiff && absDiff > maxAbsDiff)) {
             
                closestDiff = currentDiff;
                maxAbsDiff = absDiff;

                result.clear();
                result.add(arr[i]);
                result.add(arr[j]);
            }

            
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
