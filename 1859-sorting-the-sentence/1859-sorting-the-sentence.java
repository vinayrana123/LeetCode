class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (String word : words) {

            int last = word.length() - 1;

            // Get position
            int index = word.charAt(last) - '0';

            // Remove last digit
            String actualWord = word.substring(0, last);

            // Put word at correct position
            ans[index - 1] = actualWord;
        }

        return String.join(" ", ans);
    }
}