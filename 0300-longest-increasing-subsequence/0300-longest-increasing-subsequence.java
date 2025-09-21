class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [] T=new int[n];
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(T[j]+1>T[i])
                    {
                        T[i]=T[j]+1;
                    }
                }
            }
        }
        int max=0;
        for(int i=0;i<T.length;i++)
        {
            if(T[i]>T[max])
            {
                max=i;
            }
        }
        return T[max]+1;
        
    }
}