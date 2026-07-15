class Solution {

    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public int primePalindrome(int n) {

        // Small special cases
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        // Generate only odd-length palindromes
        for (int i = 1; i < 100000; i++) {

            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder(s);

            // Remove last digit to make odd-length palindrome
            sb.deleteCharAt(sb.length() - 1);
            sb.reverse();

            int palindrome = Integer.parseInt(s + sb.toString());

            if (palindrome >= n && isPrime(palindrome))
                return palindrome;
        }

        return -1;
    }
}