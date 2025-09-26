class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=maxWeight(weights,n);
        int high=sumWeight(weights,n);
        int ans=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int reqDays=findDays(weights,n,mid);
            if(reqDays<=days)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int maxWeight(int [] weights,int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(weights[i]>max)
            {
                max=weights[i];
            }
        }
        return max;
    }
    public static int sumWeight(int[] weights,int n)
    {
        int total=0;
        for(int i=0;i<n;i++)
        {
            total+=weights[i];
        }
        return total;
    }
    public static int findDays(int [] weights,int n,int cap)
    {
        int load=0;
        int day=1;
        for(int i=0;i<n;i++)
        {
            if(load+weights[i]>cap)
            {
                day+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }

}