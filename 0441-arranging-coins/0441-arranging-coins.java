// class Solution {
//     public int arrangeCoins(int n) {
//         int start=0;
//         int end = n;

//         while(start<=end){
//             int mid = start+(end-start)/2;
//             long point = (long) mid * (mid+1)/2;
//             if(point>n){
//                 end = mid-1;
//             }
//             else if(point<n){
//                 start = mid+1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return end;

        //more optimize  
        class Solution {
        public int arrangeCoins(int n) {
        return (int)(-0.5 + Math.sqrt(2L * n + 0.25));
    }
}

        //brute force solution:-

        // int i=1;
        // while(n>=i){
        //     n=n-i;
        //     i++;
        // }
        //    return i-1;
//     }
// }