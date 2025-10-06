class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // sort to handle duplicates
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int index, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue; // skip duplicates
            if (arr[i] > target) break;

            ds.add(arr[i]);
            backtrack(i + 1, arr, target - arr[i], ds, ans); // move to next index
            ds.remove(ds.size() - 1);
        }
    }
}
