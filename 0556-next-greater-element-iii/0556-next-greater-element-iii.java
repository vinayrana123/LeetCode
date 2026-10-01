// class Solution {
//     public int nextGreaterElement(int n) {
//          int[] digits = Integer.toString(n).chars().map(c -> c - '0').toArray();
//          int m = digits.length;
//          int temp = digits[m-1];
//          digits[m-1] = digits[m-2];
//          digits[m-2] = temp;
//          int n1 = Arrays.stream(digits).reduce(0, (total, digit) -> (total * 10) + digit);
//          if(n<n1){
//             return n1;
//          }
//     return -1;
//     }
// }

class Solution {
    public int nextGreaterElement(int n) {

        char[] digits = Integer.toString(n).toCharArray();
        int m = digits.length;

        // Step 1: Find pivot
        int i = m - 2;

        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            return -1;
        }

        // Step 2: Find digit greater than pivot
        int j = m - 1;

        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the right portion
        int left = i + 1;
        int right = m - 1;

        while (left < right) {
            temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;

            left++;
            right--;
        }

        // Step 5: Convert to number
        long result = Long.parseLong(new String(digits));

        // Step 6: Check conditions
        if (result > Integer.MAX_VALUE || result < n) {
            return -1;
        }

        return (int) result;
    }
}