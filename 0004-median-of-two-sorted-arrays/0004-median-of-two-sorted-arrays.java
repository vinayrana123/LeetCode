class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // nums1 should be the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int l = 0;
        int r = m;

        while (l <= r) {

            // Partition in nums1
            int Px = l + (r - l) / 2;

            // Partition in nums2
            int Py = (m + n + 1) / 2 - Px;

            // Left side of nums1
            int x1 = (Px == 0) ? Integer.MIN_VALUE : nums1[Px - 1];

            // Left side of nums2
            int x2 = (Py == 0) ? Integer.MIN_VALUE : nums2[Py - 1];

            // Right side of nums1
            int x3 = (Px == m) ? Integer.MAX_VALUE : nums1[Px];

            // Right side of nums2
            int x4 = (Py == n) ? Integer.MAX_VALUE : nums2[Py];

            // Correct partition
            if (x1 <= x4 && x2 <= x3) {

                // Odd total length
                if ((m + n) % 2 == 1) {
                    return Math.max(x1, x2);
                }

                // Even total length
                return (Math.max(x1, x2) + Math.min(x3, x4)) / 2.0;
            }

            // Move towards left
            else if (x1 > x4) {
                r = Px - 1;
            }

            // Move towards right
            else {
                l = Px + 1;
            }
        }

        return -1;
    }
}




    //brute force
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //    int[] result = new int[nums1.length + nums2.length];

    //     for (int i = 0; i < nums1.length; i++) {
    //     result[i] = nums1[i];
    // }

    //     for (int i = 0; i < nums2.length; i++) {
    //     result[nums1.length + i] = nums2[i];
    // } 
    // Arrays.sort(result);
    // int n = result.length;
    // if(n%2 != 0){
    //     return result[n/2];
    // }else{
    //    return (result[n / 2 - 1] + result[n / 2]) / 2.0;
    // }
//     }
// }