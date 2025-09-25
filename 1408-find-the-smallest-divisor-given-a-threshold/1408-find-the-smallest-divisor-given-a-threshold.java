class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = max(nums, n);
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int div = findSmallDivisor(nums, mid);
            
            if (div <= threshold) {
                ans = mid;
                high = mid - 1;  
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }

    public static int max(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSmallDivisor(int[] nums, int mid) {
        int total = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            total += (nums[i] + mid - 1) / mid; 
        }
        return total;
    }
}
