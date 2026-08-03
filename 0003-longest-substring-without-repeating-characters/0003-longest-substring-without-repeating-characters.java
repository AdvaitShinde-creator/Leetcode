class Solution {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> seen = new HashSet<>();
        char[] arr = s.toCharArray();

        int len = 0;
        int count = 0;

        for(int i = 0; i < arr.length ; i++){
            if(seen.contains(arr[i])){
                seen.clear();
                i = Math.abs(i - count);
                count = 0;
                continue;
            }
            seen.add(arr[i]);
            count++;
            if(len < count){
                len = count;
            }
        }
        return len;
    }
}