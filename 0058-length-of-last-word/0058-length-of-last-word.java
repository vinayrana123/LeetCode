class Solution {
    public int lengthOfLastWord(String s) {
    String rev = new StringBuilder(s).reverse().toString();
    String[] arr = rev.trim().split(" ");
    int n = arr[0].length();
    return n;


    }
}