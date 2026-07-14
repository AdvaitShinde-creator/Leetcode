class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int ind = 0;

        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (ind == strs[i].length()) {
                    return sb.toString();
                }
            }

            char curr = strs[0].charAt(ind);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(ind) != curr) {
                    return sb.toString();
                }
            }
            sb.append(curr);
            ind++;
        }
    }
}