
import java.util.*;

class Solution {

    public boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return false;
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        // Sort nums1
        Arrays.sort(nums1);

        HashSet<Integer> set = new HashSet<>();

        // Check every element of nums2
        for (int num : nums2) {
            if (binarySearch(nums1, num)) {
                set.add(num);
            }
        }

        // Convert HashSet to array
        int[] result = new int[set.size()];

        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}





//     public int[] intersection(int[] nums1, int[] nums2) {
//       int n = nums1.length;
//       int m = nums2.length;
//       int[] count =[];
//       for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(nums1[i]==nums2[j]){
//                 count++;
//             }
//         }
//       } 
//       return count; 
//     }
// }