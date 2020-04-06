package DynamicProgramming;

public class BestTimeToBuyandSellStock_121 {

  /*
   1. Brute Force
   Runtime: 528 ms, faster than 5.02% of Java online submissions for Best Time to Buy and Sell Stock.
   Memory Usage: 42.3 MB, less than 5.31% of Java online submissions for Best Time to Buy and Sell Stock.
  */

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.length; ++i) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] < prices[j]) {
          maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
        }
      }
    }
    return maxProfit;
  }

  //  private int findMaxSellPrice(int[] prices, int index, int buy) {
  //
  //    // base case
  //    if (buy != 0 && buy < prices[index]) {
  //      return prices[index];
  //    }
  //    // buy
  //    int a = -prices[index] + findMaxSellPrice(prices, index + 1, prices[index]);
  //    // not buy
  //    int b = findMaxSellPrice(prices, index + 1, buy);
  //    return Math.max(a, b);
  //  }
}

/*

Day:    1 2 3 4 5 6
Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.

Maximize profit = - Min(buy price) + Max(sell price) > 0 (sell price > buy price)
 n 日目に買った場合、 n+1日目以降でn日目の値段より大きくて最大の値段をを探す

DP -> Recursionではない。 DP ∋ Recursion。
再帰の形にこだわりすぎた

動的計画法（Dynamic Programming）をサルでも分かるように説明する - その１（フィボナッチ数列）
https://www.jabba.cloud/20161020172918/

わからないなら、 まず計算量を気にせずfor文でもいいので全探索（ Brute Force）で解く。
そして、それをトップダウン or ボトムアップにできないかを考えてみる

> 1.問題を全探索で解く（実際にコードを書かなくても頭の中で考える）
> 2.全探索版を「トップダウン：メモ化再帰」にする
> 3.もしくは全探索版を「ボトムアップ：漸化式ループ」にする




Kadane's Algorithm
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39112/Why-is-this-problem-tagged-with-%22Dynamic-programming%22

DP
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39038/Kadane's-Algorithm-Since-no-one-has-mentioned-about-this-so-far-%3A)-(In-case-if-interviewer-twists-the-input)
 */
