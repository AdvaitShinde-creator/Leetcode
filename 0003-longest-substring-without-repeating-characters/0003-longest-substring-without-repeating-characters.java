class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int maxLen = 0;
        int left = 0; // Left boundary of our sliding window

        for (int right = 0; right < s.length(); right++) {
            // If duplicate found, remove characters from the left until it's gone
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            
            seen.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}