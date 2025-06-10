class Solution {
    public int uniquePathsWithObstacles(int[][] nums) {
        int r = nums.length;
        int c = nums[0].length;
        int[][] dp = new int[r][c];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return findPaths(nums , r, c, 0 , 0 , dp);
    }
    private int findPaths(int[][] nums , int r, int c , int i, int j , int[][] dp) {
        if (i >= r || j >= c || nums[i][j] == 1) {
            return 0;
        }
        if (i == r - 1 && j == c - 1) {
            return 1;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right = findPaths(nums, r , c, i, j + 1, dp);
        int down = findPaths(nums, r, c , i + 1, j , dp);
        dp[i][j] = right + down;
        return dp[i][j];
    }

}