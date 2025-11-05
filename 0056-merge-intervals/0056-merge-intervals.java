import java.util.*;

class Solution {
  
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If merged list is empty or no overlap
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval[0]) {
                merged.add(Arrays.asList(interval[0], interval[1]));
            } else {
                // Overlapping: update end to max of both
                int last = merged.size() - 1;
                int maxEnd = Math.max(merged.get(last).get(1), interval[1]);
                merged.get(last).set(1, maxEnd);
            }
        }

        int[][] result = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            result[i][0] = merged.get(i).get(0);
            result[i][1] = merged.get(i).get(1);
        }

        return result;
    }
}
