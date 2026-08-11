class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p = prices.length;
        int d = discounts.length;
        double total = 0;
        int j = d - 1;
        for (int i = p - 1; i >= 0; i--) {
            if (j >= 0) {
                total += (prices[i] * (100 - discounts[j])) / 100.0;
                j--;
            } else {
                total += prices[i];
            }
        }

        return total;
    }
    
}