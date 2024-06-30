class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftCheck = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightCheck = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (leftCheck && rightCheck) {
                    flowerbed[i] = 1;
                    n--;
                    // Skip the next position as we cannot plant adjacent flowers
                    i++;
                }
            }
        }
        return n <= 0;
    }
}