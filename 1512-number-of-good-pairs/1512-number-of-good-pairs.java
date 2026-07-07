import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            result += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return result;
    }
}