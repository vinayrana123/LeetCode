class Solution {

    public boolean canEatAll(int[] piles, int mid, int h) {
        int actualHours = 0;

        for (int x : piles) {
            actualHours += x / mid;

            if (x % mid != 0) {
                actualHours++;
            }

            // Agar hours already h se zyada ho gaye
            if (actualHours > h) {
                return false;
            }
        }

        return actualHours <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;

        int r = Arrays.stream(piles).max().getAsInt();

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (canEatAll(piles, mid, h)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}