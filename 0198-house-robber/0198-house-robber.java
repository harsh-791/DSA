class Solution {
    int[] dp;
    public int helper(int idx, int[] nums){
        if(idx>=nums.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int ans1 = nums[idx] + helper(idx+2,nums);
        int ans2 = helper(idx+1,nums);

        return dp[idx] = Math.max(ans1,ans2);
    }

    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(0,nums);
    }
}