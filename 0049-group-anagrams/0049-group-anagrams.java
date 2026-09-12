import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String temp = strs[i];

            // Convert string to character array
            char[] chars = temp.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert back to String
            String key = new String(chars);

            // Add original string to its anagram group
            mp.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        // Add all groups to result
        for (List<String> group : mp.values()) {
            result.add(group);
        }

        return result;
    }
}