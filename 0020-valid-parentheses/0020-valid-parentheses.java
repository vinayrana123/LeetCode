class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        int count = 0;

        if (n % 2 != 0) {
            return false;
        }

        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                arr[count] = ch;
                count++;
            } else {
                if (count == 0) {
                    return false;
                }

                count--;

                if (ch == ')' && arr[count] != '(' ||
                    ch == ']' && arr[count] != '[' ||
                    ch == '}' && arr[count] != '{') {
                    return false;
                }
            }
        }

        return count == 0;
    }
}