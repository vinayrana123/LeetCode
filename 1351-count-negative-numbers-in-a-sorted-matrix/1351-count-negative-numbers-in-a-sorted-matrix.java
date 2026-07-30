class Solution {
    public int countNegatives(int[][] grid) {
        //Binary Search
    int row = grid.length;
    int col =  grid[0].length;
    int count = 0;

    for(int i=0;i<row;i++){
        int start = 0;
        int end = col-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(grid[i][mid]<0){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        count += col-start;
    }

 return count;



    
        //brute force
        // int m = grid.length;
        // int n = grid[0].length;
        // int result = 0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(grid[i][j]<0){
        //             result++;
        //         }
        //     }
        // }
        // return result;
    }
}