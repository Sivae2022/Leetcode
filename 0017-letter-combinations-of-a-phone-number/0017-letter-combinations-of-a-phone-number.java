import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return ans;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(ans, digits, map, new StringBuilder(), 0);
        return ans;
    }

    private void backtrack(List<String> ans, String digits, Map<Character, String> map,
            StringBuilder temp, int index) {
        if (index == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            temp.append(c);
            backtrack(ans, digits, map, temp, index + 1);
            temp.deleteCharAt(temp.length() - 1); 
        }
    }
}
