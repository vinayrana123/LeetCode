import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Find first index where nums[index] >= mid
            int left = 0;
            int right = n - 1;
            int first = n;

            while (left <= right) {
                int m = left + (right - left) / 2;

                if (nums[m] >= mid) {
                    first = m;
                    right = m - 1;
                } else {
                    left = m + 1;
                }
            }

            int count = n - first;

            if (count == mid) {
                return mid;
            } 
            else if (count > mid) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}

        //Brute Force

//        int n = nums.length;
//        for(int x =1;x<=n;x++){
//         int count = 0;
//         for(int i=0;i<n;i++){
//             if(nums[i]>= x){
//                 count++;
//             }
//         }
       
//        if(count==x){
//         return x;
//        }
//         }
//         return -1;
//     }
// }
