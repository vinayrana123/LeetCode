class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] mp = new int[1001];

        // Frequency count of arr1
        for (int num : arr1) {
            mp[num]++;
        }

        int i = 0;

        // Put elements according to arr2 order
        for (int num : arr2) {
            while (mp[num]-- > 0) {
                arr1[i++] = num;
            }
        }

        // Put remaining elements in increasing order
        for (int num = 0; num < mp.length; num++) {
            while (mp[num]-- > 0) {
                arr1[i++] = num;
            }
        }

        return arr1;
    }
}