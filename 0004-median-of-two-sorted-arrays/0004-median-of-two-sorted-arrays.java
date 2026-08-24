class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] result = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
        result[i] = nums1[i];
    }

        for (int i = 0; i < nums2.length; i++) {
        result[nums1.length + i] = nums2[i];
    } 
    Arrays.sort(result);
    int n = result.length;
    if(n%2 != 0){
        return result[n/2];
    }else{
       return (result[n / 2 - 1] + result[n / 2]) / 2.0;
    }
    }
}