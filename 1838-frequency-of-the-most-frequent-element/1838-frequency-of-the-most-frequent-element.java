class Solution {

    public int bSearch(int targetIdx, int k, int[] nums, long[] prefixSum) {

        int target = nums[targetIdx];

        int l = 0;
        int r = targetIdx;

        int bestIdx = targetIdx;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            long count = targetIdx - mid + 1;
            long windowSum = count * target;

            long currSum =
                    prefixSum[targetIdx]
                    - prefixSum[mid]
                    + nums[mid];

            long ops = windowSum - currSum;

            if (ops > k) {
                l = mid + 1;
            } else {
                bestIdx = mid;
                r = mid - 1;
            }
        }

        return targetIdx - bestIdx + 1;
    }
    public int maxFrequency(int[] nums, int k) {
        int n  = nums.length;

        Arrays.sort(nums);

        long[] prefixSum= new long[n];

        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1] + nums[i];
        }
        int result = 0;
        for(int target_idx=0;target_idx<n;target_idx++){
            result = Math.max(result,bSearch(target_idx,k,nums,prefixSum));
        }
        return result;
    }
}