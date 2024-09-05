class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = (n1 + n2);
        int i = 0;
        int j = 0;
        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int cnt = 0;
        int k1 = -1;
        int k2 = -1;
        
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (cnt == ind1) k1 = nums1[i];
                if (cnt == ind2) k2 = nums1[i];
                i++;
            } else {
                if (cnt == ind1) k1 = nums2[j];
                if (cnt == ind2) k2 = nums2[j];
                j++;
            }
            cnt++;
        }
        
        while (i < n1) {
            if (cnt == ind1) k1 = nums1[i];
            if (cnt == ind2) k2 = nums1[i];
            i++;
            cnt++;
        }
        
        while (j < n2) {
            if (cnt == ind1) k1 = nums2[j];
            if (cnt == ind2) k2 = nums2[j];
            j++;
            cnt++;
        }
        
        if (n % 2 == 0) {
            return (k1 + k2) / 2.0;  
        }
        return (double) k2;
    }
}
