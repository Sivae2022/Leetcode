class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split the string into words by spaces
        StringBuilder sb = new StringBuilder();
        
        // Iterate over the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]); // Append the word
            if (i != 0) { // Add a space if it's not the last word
                sb.append(" ");
            }
        }
        return sb.toString(); // Convert StringBuilder to String
    }
}
