class Solution {
    public int reachNumber(int target) {

        target = Math.abs(target);   //absolute valuee hai abs ka mtlb
        int start = 0;
        int end = target;

        while(start<end){
            int mid = start + (end-start)/2;

            long sum = (long) mid*(mid+1)/2;

            if(sum>=target){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
//start  = minimum number of steps
            long sum = (long) start * (start+1)/2;
            while((sum-target)%2 != 0){
                start++;
                sum = start*(start+1)/2;
            }
            return (int) start;

        
    }
}
//         int sum = 0;
//         int step = 0;

//         while (sum < target) {
//             step++;
//             sum += step;
//         }

//         while ((sum - target) % 2 != 0) {
//             step++;
//             sum += step;
//         }

//         return step;
//     }
// }