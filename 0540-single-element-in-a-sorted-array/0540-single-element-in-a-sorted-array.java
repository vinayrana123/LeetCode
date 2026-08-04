class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start<end){
            int mid = start + (end-start)/2;
            //right side even ya odd hai

            boolean isEven;
            if((end-mid)%2==0){
                isEven = true;
            }else{
                isEven = false;
            }
            //check the mid+1 is equal to mid or not

            if(nums[mid]==nums[mid+1]){
                if(isEven){
                    start = mid+2;
                }else{
                    end = mid-1;
                }
            }
            else{
                //nums[mid] != nums[mid+1]
                if(isEven){
                    end = mid;
                }else{
                    start = mid+1;
                }
            }
        }
        return nums[end];
    }
}




     //approach 1 xor kar lo sbka
    //  int n = nums.length;

    //  int xor = 0;
    // for(int i=0;i<n;i++){
    //     xor = xor^nums[i];
    // }
    // return xor;
//     }
// }