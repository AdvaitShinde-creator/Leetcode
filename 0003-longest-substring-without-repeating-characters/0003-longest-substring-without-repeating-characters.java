class Solution {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> seen = new HashSet<>();
        char[] arr = s.toCharArray();

        int len = 0;
        int left = 0;

        for(int right = 0; right < arr.length ; right++){
            while(seen.contains(arr[right])){
                seen.remove(arr[left]);
                left++;
            }
            seen.add(arr[right]);
            len = Math.max(len , right-left+1);
        }
        return len;
    }
}