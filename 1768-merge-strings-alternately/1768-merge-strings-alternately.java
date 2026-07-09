class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        StringBuilder ans = new StringBuilder();

        int x = 0;
        int y = 0;

        for(int i = 0 ; i < n ; i++){
            if(x < word1.length() && i%2 == 0){
                ans.append(word1.charAt(x));
                x++;
            }
            else{
                if(y < word2.length()){
                    ans.append(word2.charAt(y));
                    y++;
                }
            }
        }

        while(x < word1.length()){
            ans.append(word1.charAt(x));
            x++;
        }

        while(y < word2.length()){
            ans.append(word2.charAt(x));
            y++;
        }
        
        return new String(ans);
    }
}