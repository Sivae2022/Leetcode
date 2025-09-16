class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backTrack(ans,new ArrayList<>(),nums);
        return ans;
    }
    public void backTrack(List<List<Integer>> ans,ArrayList<Integer> tempList,int [] nums)
    {
        int n=nums.length;
        if(n==tempList.size())
        {
            ans.add(new ArrayList<>(tempList));
            return;
        }
        for(int num:nums)
        {
            if(tempList.contains(num))
            {
                continue;
            }
            tempList.add(num);
            backTrack(ans,tempList,nums);
            tempList.remove(tempList.size()-1);

        }
    }
}