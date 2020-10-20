class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        for (int i = piles.length / 3; i < piles.length - 1; i += 2) 
            ans += piles[i];
        return ans;
    }
}
