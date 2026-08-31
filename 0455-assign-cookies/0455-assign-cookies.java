class Solution {
    public int findContentChildren(int[] g, int[] s) {
//brute force
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    if(s[j]>=g[i]){
                        count++;
                    
                    s[j]  = -1;
                    break;
                    }
                }
            }
        return count;
    }
}