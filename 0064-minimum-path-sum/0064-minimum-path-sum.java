class Solution {
    public int minPathSum(int[][] nums) {
        int[][] dp = new int[nums.length][nums[0].length];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }
        return helper(nums , 0 , 0, dp);
    }

    private int helper(int[][] nums, int i , int j , int[][] dp){
        if (i >= nums.length || j >= nums[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == nums.length - 1 && j == nums[0].length - 1) {
            return nums[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = helper(nums,i , j+1 , dp);
        int down = helper(nums,i + 1, j, dp);
        int min = Math.min(right, down)+nums[i][j];
        return dp[i][j] = min;
        }
}