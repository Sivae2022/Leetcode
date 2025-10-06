class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(ans, nums, new ArrayList<>(), 0);
        return ans;
    }

    private void backTrack(List<List<Integer>> ans, int[] nums, List<Integer> temp, int index) {
        if (ans.contains(temp))
            return;
        ans.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            //if (i > index && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            backTrack(ans, nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}