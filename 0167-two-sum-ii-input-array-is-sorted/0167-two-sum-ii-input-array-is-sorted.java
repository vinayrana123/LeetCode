class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
       int i=0;
       int j=n-1;

       while(i<j){
        int sum = numbers[i]+numbers[j];
       if(sum>target){
        j--;
       }else if(sum<target){
        i++;
       }else{
        return new int[] {i+1,j+1};
       }
       }
       return new int[] {};
    }
}
//         for(int i=0;i<numbers.length-1;i++){
//             for(int j=i+1;i<numbers.length;j++){
//                 if(numbers[i]+numbers[j]==target){
//                 return new int[]{i+1,j+1};
//             }
//         }
//     }
//         return new int[]{};
//     }
// }