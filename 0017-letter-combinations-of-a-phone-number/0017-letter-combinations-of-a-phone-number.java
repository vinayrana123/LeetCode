import java.util.Arrays;

class Solution {
    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return KeyPadList("", digits);
    }

    static ArrayList<String> KeyPadList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        // Handle 7 and 9 separately because they have 4 letters
        int start, end;

        if (digit == 7) {
            start = 15;
            end = 19;
        } else if (digit == 8) {
            start = 19;
            end = 22;
        } else if (digit == 9) {
            start = 22;
            end = 26;
        } else {
            start = (digit - 2) * 3;
            end = start + 3;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(KeyPadList(p + ch, up.substring(1)));
        }

        return list;
    }
}

    // static void keyPad(String p,String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    // }
    // int digit = up.charAt(0) - '0';
    // for(int i = (digit - 1)*3;i<digit*3;i++){
    //     char ch = (char)('a' + i);
    //     keyPad(p+ch,up.substring(1));
    // }