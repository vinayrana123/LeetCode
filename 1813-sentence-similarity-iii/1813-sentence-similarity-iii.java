// class Solution {
//     public boolean areSentencesSimilar(String sentence1, String sentence2) {
//         int n1 =  sentence1.length();
//         int n2 = sentence2.length();
//         if(n2>n1){
//             return false;
//         }
//         else{
//             String[] arr1 = sentence1.split(" ");
//             String[] arr2 = sentence2.split(" ");
//             for(int i=0;i<n1;i++){
//                 for(int j=0;j<n2;j++){
//                    if(arr1[i].equal(arr2[j])){
//                         return true;
//                    }
//                 }
//             }
//         } 
//         return false;
//     }
// }

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        String[] arr1 = sentence1.split(" ");
        String[] arr2 = sentence2.split(" ");

        int n1 = arr1.length;
        int n2 = arr2.length;

        if (n1 > n2) {
            return areSentencesSimilar(sentence2, sentence1);
        }

        int i = 0;

        while (i < n1 && arr1[i].equals(arr2[i])) {
            i++;
        }

        int j = 0;

        while (j < n1 - i &&
               arr1[n1 - 1 - j].equals(arr2[n2 - 1 - j])) {
            j++;
        }

        return i + j == n1;
    }
}