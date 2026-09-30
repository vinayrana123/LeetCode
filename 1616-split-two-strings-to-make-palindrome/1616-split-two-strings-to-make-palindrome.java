// // class Solution {
// //     public boolean checkPalindromeFormation(String a, String b) {
// //        int n1 = a.length();
// //        int n2 = b.length();
// //        String sb = new StringBuilder();
// //        if(n1 != n2){
// //         return false;
// //        }
// //        while(n1==n2){
// //            for(int i=0;i<n1;i++){
// //             for(int j=n2-1;j=0n2;j++){
// //                 sb.append()
// //             }
// //            }
// //        } 
// //     }
// // }

// class Solution {
//     public boolean checkPalindromeFormation(String a, String b) {
//         return check(a, b) || check(b, a);
//     }

//     public boolean check(String s1, String s2) {
//         int i = 0;
//         int j = s1.length() - 1;

//         while (i < j) {
//             if (s1.charAt(i) == s2.charAt(j)) {
//                 i++;
//                 j--;
//             } else {
//                 StringBuilder sb = new StringBuilder();

//                 sb.append(s1.substring(0, i));
//                 sb.append(s2.substring(j));

//                 String s = sb.toString();

//                 return isPalindrome(s);
//             }
//         }

//         return true;
//     }

//     public boolean isPalindrome(String s) {
//         int i = 0;
//         int j = s.length() - 1;

//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }

//         return true;
//     }
// }

class Solution {

    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    public boolean check(String s1, String s2) {
        int i = 0;
        int j = s1.length() - 1;

        while (i < j) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j--;
            } else {
                return isPalindrome(s1, i, j) ||
                       isPalindrome(s2, i, j);
            }
        }

        return true;
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}