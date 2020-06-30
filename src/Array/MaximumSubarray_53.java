package Array;

public class MaximumSubarray_53 {

  public static void main(String[] args) {
    MaximumSubarray_53 s = new MaximumSubarray_53();
    int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(s.maxSubArray(array));
  }

  //    Runtime: 202 ms, faster than 5.01% of Java online submissions for Maximum Subarray.
  //    Memory Usage: 42 MB, less than 5.06% of Java online submissions for Maximum Subarray.

  // O(n^2)
  public int maxSubArray(int[] nums) {

    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        maxSum = Math.max(maxSum, sum);
      }
      maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
  }
}
