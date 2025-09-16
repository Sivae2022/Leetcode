class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        back(ans, nums, new ArrayList<>(), 0);
        return ans;
    }

    public void back(List<List<Integer>> ans, int[] nums, List<Integer> tempList, int start) {
        ans.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            back(ans, nums, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}