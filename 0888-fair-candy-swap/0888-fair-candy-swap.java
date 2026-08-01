class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int [] answer = new int[2];
        int sumA = 0;
        int sumB = 0;

        for(int i=0;i<a.length;i++)
            sumA = sumA + a[i];
        
        for(int i=0;i<b.length;i++)
            sumB = sumB + b[i];
        
        for(int i=0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(sumA - a[i] + b[j] == sumB + a[i] - b[j]){
                    answer[0]=a[i];
                    answer[1]=b[j];
                    return answer;
                } // ye condition hai a or i ma + + krna ki

            }
        }
        return answer;
    }
}