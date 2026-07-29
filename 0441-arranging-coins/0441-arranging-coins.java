class Solution {
    public int arrangeCoins(int n) {
        int start=0;
        int end = n;

        while(start<=end){
            int mid = start+(end-start)/2;
            long point = (long) mid * (mid+1)/2;
            if(point>n){
                end = mid-1;
            }
            else if(point<n){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
        // int i=1;
        // while(n>=i){
        //     n=n-i;
        //     i++;
        // }
        //    return i-1;
    }
}