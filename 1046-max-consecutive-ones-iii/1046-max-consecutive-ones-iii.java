class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,n=nums.length,maxLen=0,zero=0;
        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)
            {
                zero++;
            }
            while(zero>k)
            {
                if(nums[left]==0)
                {
                    zero--;
                }
                left++;
            }
            if(zero<=k)   maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}