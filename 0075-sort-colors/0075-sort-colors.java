class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

    //   int n = nums.length;
    //   int countZero = 0;
    //   int countOne = 0;
    //   int countTwo = 0;


    //   //o(n)
    //   for(int i=0;i<nums.length;i++){
    //     if(nums[i]==0){
    //         countZero++;
    //     }
    //     else if(nums[i]==1){
    //         countOne++;

    //     }
    //     else{
    //         countTwo++;
    //     }
    //   }
    //   //o(n)
    //   int index=0;
    //   for(int i=0;i<countZero;i++){
    //     nums[index++]=0;
    //   }
    //   for(int i=0;i<countOne;i++){
    //     nums[index++]=1;
    //   }
    //   for(int i=0;i<countTwo;i++){
    //     nums[index++]=2;
    //   }  
     