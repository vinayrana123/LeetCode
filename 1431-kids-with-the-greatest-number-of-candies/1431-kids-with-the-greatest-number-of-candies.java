class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List <Boolean> ans = new ArrayList<>();

        for(int candy: candies){
            if(candy + extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        } 
        return ans;
    }
}