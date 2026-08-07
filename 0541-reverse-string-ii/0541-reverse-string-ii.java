class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while (i < n) {
            int end = Math.min(i + k, n);
            for (int j = end - 1; j >= i; j--) {
                sb.append(s.charAt(j));
            }
            int remain = Math.min(i + 2 * k, n);
            for (int j = end; j < remain; j++) {
                sb.append(s.charAt(j));
            }
            i += 2 * k;
        }
        return sb.toString();
    }
}
