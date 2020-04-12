package DynamicProgramming;

import java.util.Arrays;

/*
 https://leetcode.com/problems/climbing-stairs/
 Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 Memory Usage: 35.8 MB, less than 5.26% of Java online submissions for Climbing Stairs.
*/
public class ClimbingStairs_70 {
  public int climbStairs(int n) {

    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }

    int[] dp = new int[n + 1];
    Arrays.fill(dp, 0);

    dp[1] = 1;
    dp[2] = 2;

    for (int i = 3; i < n + 1; ++i) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }
}
