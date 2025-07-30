class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int i=1;
        int maxLen=0;
        while(i<n-1)
        {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
            
            {
                int left=i-1;
                int right=i+1;
                while(left>0 && arr[left]>arr[left-1])
                {
                    left--;
                }
                
                while(right<n-1 && arr[right]>arr[right+1])
                {
                    right++;
                }
                maxLen=Math.max(maxLen,right-left+1);
                i=right;
            }
            else{
                i++;
            }
        }
        return maxLen;
    }
}