class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        int j = 0;
        boolean value = false;
        int ans = 0;

        for(int i = 0; i < n ; i++){
            ans = i;
            while(ans < n && j < m && haystack.charAt(ans) == needle.charAt(j)){
                ans++;
                j++;
                value = true;
            }
            if(value && j == m){
                return i;
            }
            value = false;
            j = 0;
        }
        return -1;
    }
}