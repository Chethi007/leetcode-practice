package leetcode20200921to20201031.medium;

import leetcode20200921to20201031.BasicTemplate;

public class LC322CoinChange extends BasicTemplate {

    public static void main(String[] args) {
        var LC = new LC322CoinChange();
        var r = LC.coinChange(new int[]{2}, 3);
    }

    public int coinChange(int[] coins, int amount) {
        int[] x = new int[amount + 1];
        x[0] = 0;
        for (int i = 1; i < x.length; i++) {
            x[i] = Integer.MAX_VALUE - 1;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    x[i] = Math.min(x[i], x[i - coins[j]] + 1);
                }
            }
        }
        return x[amount] == Integer.MAX_VALUE - 1 ? -1 : x[amount];
    }
}
