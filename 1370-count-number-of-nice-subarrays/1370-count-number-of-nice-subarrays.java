class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int l = 0, res = 0, oddCount = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] % 2 == 1) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[l] % 2 == 1) {
                    oddCount--;
                }
                l++;
            }

            res += r - l + 1;
        }

        return res;
    }
}
