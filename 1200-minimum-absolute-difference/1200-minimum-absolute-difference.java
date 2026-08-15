class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<> ();

        int n  = arr.length;
        // from here we calculate the mindifference btw element 
         int minDiff = Integer.MAX_VALUE;
         for(int i = 1;i<n;i++){
            int diff = arr[i]-arr[i-1];
            minDiff = Math.min(minDiff, diff);
         }

         //now we make the pairs 
         for(int i=1;i<n;i++){
            int diff = arr[i]-arr[i-1];
            if(minDiff==diff){
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
         }
         return result;
    }
}