import java.util.*;

class Solution {

    private int[] count;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        count = new int[n];

        // {value, originalIndex}
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        mergeSort(arr, 0, n - 1);

        List<Integer> answer = new ArrayList<>();

        for (int x : count) {
            answer.add(x);
        }

        return answer;
    }

    private void mergeSort(int[][] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private void merge(int[][] arr, int left, int mid, int right) {

        int[][] temp = new int[right - left + 1][2];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Number of smaller elements taken from right side
        int smallerCount = 0;

        while (i <= mid && j <= right) {

            if (arr[j][0] < arr[i][0]) {

                smallerCount++;

                temp[k++] = arr[j++];

            } else {

                // All elements already moved from right are smaller
                count[arr[i][1]] += smallerCount;

                temp[k++] = arr[i++];
            }
        }

        // Remaining left elements
        while (i <= mid) {

            count[arr[i][1]] += smallerCount;

            temp[k++] = arr[i++];
        }

        // Remaining right elements
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
}


        //brute  force

        // int n =  nums.length;
        // List<Integer> answer = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     int frequency = 0;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]>nums[j]){
        //             frequency++;
        //         }
        //     }
        //     answer.add(frequency);
        // }
        // return answer;
  