// class Solution {
//     public int[] relativeSortArray(int[] arr1, int[] arr2) {

//         int[] mp = new int[1001];

//         // Frequency count of arr1
//         for (int num : arr1) {
//             mp[num]++;
//         }

//         int i = 0;

//         // Put elements according to arr2 order
//         for (int num : arr2) {
//             while (mp[num]-- > 0) {
//                 arr1[i++] = num;
//             }
//         }

//         // Put remaining elements in increasing order
//         for (int num = 0; num < mp.length; num++) {
//             while (mp[num]-- > 0) {
//                 arr1[i++] = num;
//             }
//         }

//         return arr1;
//     }
// }

import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        // arr2 ke elements ko priority/index dena
        for (int i = 0; i < arr2.length; i++) {
            mp.put(arr2[i], i);
        }

        // arr1 mein jo elements arr2 mein nahi hain
        // unki priority 1e9
        for (int num : arr1) {
            if (!mp.containsKey(num)) {
                mp.put(num, 1000000000);
            }
        }

        // int[] ko Integer[] mein convert karna
        Integer[] temp = new Integer[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i];
        }

        // Comparator
        Arrays.sort(temp, (num1, num2) -> {

            if (mp.get(num1).equals(mp.get(num2))) {
                return Integer.compare(num1, num2);
            }

            return Integer.compare(mp.get(num1), mp.get(num2));
        });

        // Integer[] se wapas int[]
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = temp[i];
        }

        return arr1;
    }
}