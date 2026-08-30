class Solution {
    public boolean containsDuplicate(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }



        // Merge Sort
    public void mergeSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    // Merge two sorted parts
    public void merge(int[] nums, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Left side ke remaining elements
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Right side ke remaining elements
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // temp ko nums me copy karo
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}


//brute force
    //     int n = nums.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
//     }
// }