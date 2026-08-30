class Solution {

    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int count = 1;

        // Right se traverse karenge
        // kyunki right side mein largest elements hain

        for (int i = n - 1; i > 0; i--) {

            // Agar current aur previous different hain
            if (nums[i] != nums[i - 1]) {
                count++;
            }

            // 3rd distinct maximum mil gaya
            if (count == 3) {
                return nums[i - 1];
            }
        }

        // Agar 3 distinct maximum nahi mile
        return nums[n - 1];
    }
}