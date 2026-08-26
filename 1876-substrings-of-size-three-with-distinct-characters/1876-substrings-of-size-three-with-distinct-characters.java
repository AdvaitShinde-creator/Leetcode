class Solution {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }

        int count = 0;
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append(s.charAt(i));
        }

        if (sb.charAt(0) != sb.charAt(1) && 
            sb.charAt(1) != sb.charAt(2) && 
            sb.charAt(0) != sb.charAt(2)) {
            count++;
        }

        for (int i = 3; i < s.length(); i++) {
            sb.append(s.charAt(i)); 
            sb.deleteCharAt(0);     
            
            if (sb.charAt(0) != sb.charAt(1) && 
                sb.charAt(1) != sb.charAt(2) && 
                sb.charAt(0) != sb.charAt(2)) {
                count++;
            }
        }

        return count;
    }
}