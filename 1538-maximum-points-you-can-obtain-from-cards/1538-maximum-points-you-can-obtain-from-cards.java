class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            left+=arr[i];
            max=left;
        }
        int rindex=n-1;
        for(int i=k-1;i>=0;i--)
        {
            left=left-arr[i];
            right+=arr[rindex];
            rindex--;
            max=Math.max(max,left+right);
        }
        return max;
    }
}