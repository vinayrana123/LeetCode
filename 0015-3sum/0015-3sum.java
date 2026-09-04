// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         List<List<Integer>> result = new ArrayList<>();
//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;i<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer> temp = new ArrayList<>();
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);

//                         result.add(temp);
//                     }
//                 }
//             }
//         }
//         return result;
        
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // i ka duplicate skip
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                }

                else if (sum > 0) {
                    k--;
                }

                else {

                    // Answer mil gaya
                    answer.add(Arrays.asList(
                        nums[i],
                        nums[j],
                        nums[k]
                    ));

                    j++;
                    k--;

                    // j ke duplicates skip
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // k ke duplicates skip
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return answer;
    }
}