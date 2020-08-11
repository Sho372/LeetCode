package DynamicProgramming;

public class HouseRobber_198 {

    int[] dp = new int[100];

    public static void main(String[] args) {
        int[] nums =  {1,2,3,1};
        HouseRobber_198 h = new HouseRobber_198();
        System.out.println(h.rob(nums));
    }

    public int rob(int[] nums) {
//        return Math.max(robHelper(nums, nums.length-1, true), robHelper(nums, nums.length-1, false));
        return robHelper2_dp(nums, nums.length - 1);
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

    //DP化していない -> TLE
    public int robHelper2(int[] nums, int index) {

        // base case
        if(nums.length == 0) return 0;
        if(index == 0) return nums[0];
        if(index == 1) return Math.max(nums[0], nums[1]);

        // recursive case
        return Math.max(nums[index] + robHelper2(nums, index -2), robHelper2(nums, index - 1));

    }

    //DP化
    public int robHelper2_dp(int[] nums, int index) {

        // base case
        if(nums.length == 0) return 0;
        if(index == 0) return nums[0];
        if(index == 1) return Math.max(nums[0], nums[1]);

        //numsのサイズが2以上ならDPの用意
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // 再帰ではなくなるので、loopでdpを埋めていく必要がある
        // bottom upのDPは再帰というより漸化式をloopで解くだけ気がする
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i -1]);
        }

        int max = 0;
        for (int n: dp) {
            max = Math.max(n, max);
        }

        return max;
    }
}
