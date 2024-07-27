class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // Pointer for the end of nums1 array
        int p = m + n - 1;

        // While there are elements to be processed in nums2
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    }
}