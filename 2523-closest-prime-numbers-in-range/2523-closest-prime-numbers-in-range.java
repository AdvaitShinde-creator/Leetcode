class Solution {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }

        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {

        int[] temp = {-1, -1};
        int[] ans = new int[right];
        int ind = 0;

        for(int i = left; i <= right; i++){
            if(isPrime(i)){
                ans[ind] = i;
                ind++;
            }
        }

        int minD = Integer.MAX_VALUE;

        for(int i = 0; i < ind - 1; i++){
            if(ans[i + 1] - ans[i] < minD){
                minD = ans[i + 1] - ans[i];
                temp[0] = ans[i];
                temp[1] = ans[i + 1];
            }
        }
        return temp;
    }
}