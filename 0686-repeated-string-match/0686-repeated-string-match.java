class Solution {
    public int repeatedStringMatch(String a, String b) {
        // if(a.contain(b)){
        //     return true;
        // }
        // else{
        //     String doubled = original + original;
        // }
        // return doubled;
        int count = 1;
        String doubled = a;
        while(doubled.length()<b.length()){
            doubled = doubled +a;
            count++;
        }
        if(doubled.contains(b)){
            return count;
        }
        doubled = doubled+a;
        count++;
        if (doubled.contains(b)) {
            return count;
        }

        return -1;
    }
}