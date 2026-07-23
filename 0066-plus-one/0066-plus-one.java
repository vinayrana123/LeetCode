class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // agar digit 9 hai, to 0 bana do
            digits[i] = 0;
        }

        // agar saare digits 9 the, jaise 999
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}