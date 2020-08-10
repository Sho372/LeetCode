package DynamicProgramming;

public class HouseRobber_198 {

    int[] dp = new int[100];

    public int rob(int[] nums) {
        return Math.max(robHelper(nums, nums.length-1, true), robHelper(nums, nums.length-1, false));
    }

    public int robHelper(int[] nums, int index, boolean robbed) {

        if(nums.length == 0 || index < 0) return 0;
        if(index == 0) return nums[0];

        int a,b;
        a = b =0;
        if(robbed) {
            a = robHelper(nums, index-1, false);
        } else {
            b = robHelper(nums, index-2, true) + nums[index];
        }
        dp[index] = Math.max(a,b);
        return dp[index];
    }
}
