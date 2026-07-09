import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum = first.add(second);
        String ans = sum.toString();
        return ans;
    }
}