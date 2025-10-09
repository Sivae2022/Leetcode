class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int left=0,right=n-1,total=0;
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        while(left<=right)
        {
            if(arr[left]<=arr[right])
            {
                if(arr[left]>=leftMax)
                {
                    leftMax=arr[left];
                }
                else{
                    total+=leftMax-arr[left];
                }
                left++;
            }
            else{
                if(arr[right]>=rightMax)
                {
                    rightMax=arr[right];
                }
                else{
                    total+=rightMax-arr[right];
                }
                right--;
            }
        }
        return total;
        
    }
}