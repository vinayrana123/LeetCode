class Solution {

    public int maxValue(int n, int index, int maxSum) {

        int low = 1;
        int high = maxSum;

        while (low < high) {

            int mid = low + (high - low + 1) / 2;

            long left = getSum(mid - 1, index);
            long right = getSum(mid, n - index);

            if (left + right <= maxSum) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    private long getSum(long x, int cnt) {

        if (x >= cnt) {
            return (x + x - cnt + 1) * cnt / 2;
        }

        return (x + 1) * x / 2 + (cnt - x);
    }
}