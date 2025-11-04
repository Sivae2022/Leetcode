import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = numRows;
        for (int i = 0; i < n; i++) {
            ans.add(generateVal(i));
        }
        return ans;
    }

    public List<Integer> generateVal(int row) {
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for (int i = 1; i <= row; i++) {
            
            ans = ans * (row - i + 1) / i;
            list.add((int) ans);
        }
        return list;
    }
}
