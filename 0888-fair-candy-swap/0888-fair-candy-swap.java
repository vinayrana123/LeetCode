import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int x : bobSizes) {
            sumB += x;
        }

        int diff = (sumB - sumA) / 2;

        Arrays.sort(bobSizes);

        for (int a : aliceSizes) {

            int target = a + diff;

            int start = 0;
            int end = bobSizes.length - 1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (bobSizes[mid] == target) {
                    return new int[]{a, target};
                }
                else if (bobSizes[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return new int[]{};
    }
}










    //brute force approach
//     public int[] fairCandySwap(int[] a, int[] b) {
//         int [] answer = new int[2];
//         int sumA = 0;
//         int sumB = 0;

//         for(int i=0;i<a.length;i++)
//             sumA = sumA + a[i];
        
//         for(int i=0;i<b.length;i++)
//             sumB = sumB + b[i];
        
//         for(int i=0;i<a.length;i++){
//             for(int j = 0;j<b.length;j++){
//                 if(sumA - a[i] + b[j] == sumB + a[i] - b[j]){
//                     answer[0]=a[i];
//                     answer[1]=b[j];
//                     return answer;
//                 } // ye condition hai a or i ma + + krna ki

//             }
//         }
//         return answer;
//     }
// }