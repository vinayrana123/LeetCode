// class Solution {
//     public int maximumRemovals(String s, String p, int[] removable) {
       
//          int r = removable.length;
//          int n = s.length();
//          int m = p.length();
//          String sb = new StringBuilder(n);
//          int k = 0;

//          while(n>m){
//             for(int i=0;i<=r;i++){
//                 sb = delete.charAt(i);
//                 if(s.contain(p)){
//                     k++;
//                 }else{
//                     break;
//                 }
//             }
//          }
//          return k;
//     }
// }

// class Solution {
//     public int maximumRemovals(String s, String p, int[] removable) {

//         int r = removable.length;
//         int k = 0;

//         StringBuilder sb = new StringBuilder(s);

//         for (int i = 0; i < r; i++) {

//             int index = removable[i];

//             char removedChar = sb.charAt(index);
//             sb.setCharAt(index, '#');

//             if (isSubsequence(sb.toString(), p)) {
//                 k++;
//             } else {
//                 break;
//             }
//         }

//         return k;
//     }

//     public boolean isSubsequence(String s, String p) {

//         int j = 0;

//         for (int i = 0; i < s.length() && j < p.length(); i++) {

//             if (s.charAt(i) == p.charAt(j)) {
//                 j++;
//             }
//         }

//         return j == p.length();
//     }
// }

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {

        int left = 0;
        int right = removable.length;

        while (left < right) {

            int mid = left + (right - left + 1) / 2;

            boolean[] removed = new boolean[s.length()];

            for (int i = 0; i < mid; i++) {
                removed[removable[i]] = true;
            }

            int j = 0;

            for (int i = 0; i < s.length() && j < p.length(); i++) {

                if (!removed[i] && s.charAt(i) == p.charAt(j)) {
                    j++;
                }
            }

            if (j == p.length()) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}