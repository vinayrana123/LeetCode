class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> arr = new ArrayList<>();
    for(int i=0;i<matrix.length;i++){
        int minIndex = 0;
        int min = 999999999;
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]<min){
                min = matrix[i][j];
                minIndex = j;
            }
        }
        boolean isTrue = true;
        for(int j=0;j<matrix.length;j++){
            if(matrix[i][minIndex]<matrix[j][minIndex]){
                isTrue = false;
                break;
        }
        }
        if(isTrue){
            arr.add(matrix[i][minIndex]);
        }
    } 
    return arr; 
    }
}