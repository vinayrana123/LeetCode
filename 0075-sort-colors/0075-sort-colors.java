class Solution {
    public void sortColors(int[] nums) {
      int n = nums.length;
      int countZero = 0;
      int countOne = 0;
      int countTwo = 0;


      //o(n)
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            countZero++;
        }
        else if(nums[i]==1){
            countOne++;

        }
        else{
            countTwo++;
        }
      }
      //o(n)
      int index=0;
      for(int i=0;i<countZero;i++){
        nums[index++]=0;
      }
      for(int i=0;i<countOne;i++){
        nums[index++]=1;
      }
      for(int i=0;i<countTwo;i++){
        nums[index++]=2;
      }  
    }
}