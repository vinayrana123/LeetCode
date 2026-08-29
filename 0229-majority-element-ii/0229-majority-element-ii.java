import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        int count1 = 0;
        int majority1 = 0;

        int count2 = 0;
        int majority2 = 0;

        // Step 1: Find two possible majority elements
        for (int i = 0; i < n; i++) {

            if (nums[i] == majority1) {
                count1++;
            }
            else if (nums[i] == majority2) {
                count2++;
            }
            else if (count1 == 0) {
                majority1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                majority2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Count actual frequency
        int freq1 = 0;
        int freq2 = 0;

        for (int num : nums) {

            if (num == majority1) {
                freq1++;
            }
            else if (num == majority2) {
                freq2++;
            }
        }

        // Step 3: Store answer
        List<Integer> result = new ArrayList<>();

        if (freq1 > n / 3) {
            result.add(majority1);
        }

        if (freq2 > n / 3) {
            result.add(majority2);
        }

        return result;
    }
}