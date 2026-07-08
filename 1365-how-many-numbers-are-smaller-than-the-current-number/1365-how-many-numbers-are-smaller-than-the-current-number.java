class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[101];

        // Count frequency
        for (int num : nums) {
            count[num]++;
        }

        // Prefix sum: count[i] = numbers <= i
        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = count[nums[i] - 1];
            }
        }

        return ans;
    }
}

 //brute force
// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {

//         int[] ans = new int[nums.length];

//         for (int i = 0; i < nums.length; i++) {

//             int count = 0;

//             for (int j = 0; j < nums.length; j++) {

//                 if (nums[j] < nums[i]) {
//                     count++;
//                 }
//             }

//             ans[i] = count;
//         }

//         return ans;
//     }
// }