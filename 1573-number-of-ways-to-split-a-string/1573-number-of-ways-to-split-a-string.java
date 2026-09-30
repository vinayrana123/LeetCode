// class Solution {
//     public int numWays(String s) {
//         int n = s.length();
//         int answer;
//         int Count1 = 0;
//         int Count0 = 0;
//         while(n>0){
//             for(int i=0;i<n;i++){
//                 if(charAt(i)==1){
//                 Count1+=1;
//                 }
//                 else{
//                 Count0 += 1;
//                 }
//                 if(Count0==Count1 && Count0<=n && count1<n){
//                     return false;

//                 }
//                 else{
//                     answer = n-1;
//                 }
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    public int numWays(String s) {

        int n = s.length();
        int Count1 = 0;
        int mod = 1000000007;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                Count1++;
            }
        }

        if (Count1 % 3 != 0) {
            return 0;
        }

        if (Count1 == 0) {
            return (int) ((long) (n - 1) * (n - 2) / 2 % mod);
        }

        int each = Count1 / 3;
        int count = 0;

        long ways1 = 0;
        long ways2 = 0;

        int i = 0;

        while (i < n && count < each) {
            if (s.charAt(i) == '1') {
                count++;
            }
            i++;
        }

        while (i < n && s.charAt(i) == '0') {
            ways1++;
            i++;
        }

        count = 0;

        while (i < n && count < each) {
            if (s.charAt(i) == '1') {
                count++;
            }
            i++;
        }

        while (i < n && s.charAt(i) == '0') {
            ways2++;
            i++;
        }

        return (int) (((ways1 + 1) * (ways2 + 1)) % mod);
    }
}