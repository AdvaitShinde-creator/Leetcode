class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || t.length() == 0 || t.length() > s.length()) {
            return "";
        }

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int required = t.length();          // characters still missing from the window
        int bestLen = Integer.MAX_VALUE;
        int bestStart = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // consuming a genuinely needed char shrinks the deficit
            if (need[s.charAt(right)]-- > 0) {
                required--;
            }

            while (required == 0) {         // window is valid -> try to shrink it
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestStart = left;
                }
                if (++need[s.charAt(left++)] > 0) {
                    required++;
                }
            }
        }

        return bestLen == Integer.MAX_VALUE
             ? ""
             : s.substring(bestStart, bestStart + bestLen);
    }
}