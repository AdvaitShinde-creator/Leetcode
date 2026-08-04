class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // Array to count letter frequencies
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // 1. Add the right character to our window tally
            char rightChar = s.charAt(right);
            counts[rightChar - 'A']++;
            
            // 2. Update the highest frequency of a single character we've seen
            maxFreq = Math.max(maxFreq, counts[rightChar - 'A']);

            // 3. Check if the window is INVALID using the Golden Formula
            int currentWindowSize = right - left + 1;
            if (currentWindowSize - maxFreq > k) {
                // The window is invalid, so shrink it from the left
                char leftChar = s.charAt(left);
                counts[leftChar - 'A']--; // Remove left character from tally
                left++;                   // Move left pointer forward
            }

            // 4. Update the longest valid window we've seen
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}