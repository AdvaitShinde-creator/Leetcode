class Solution {
    public String licenseKeyFormatting(String s, int k) {

        // Count valid characters
        int letters = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                letters++;
            }
        }

        // Edge case: no characters
        if (letters == 0) {
            return "";
        }

        // Number of dashes required
        int dashes = (letters - 1) / k;

        char[] ans = new char[letters + dashes];

        int ind = ans.length - 1;
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '-') {
                continue;
            }

            ans[ind--] = Character.toUpperCase(s.charAt(i));
            count++;

            if (count == k) {

                int j = i - 1;

                while (j >= 0 && s.charAt(j) == '-') {
                    j--;
                }

                if (j >= 0) {
                    ans[ind--] = '-';
                }

                count = 0;
            }
        }

        return new String(ans);
    }
}