class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int start =1;
        int i = 0;
        while(i+1<n){
          ans[i]=start;
          ans[i+1] = -start;
          i+=2;
          start++;

        }
        return ans;
    }
}