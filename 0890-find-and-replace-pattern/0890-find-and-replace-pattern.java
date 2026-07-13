class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            char[] arrPattern = new char[26];
            char[] arrWord = new char[26];

            boolean value = true;

            if (words[i].length() != pattern.length()) {
                continue;
            }

            for (int j = 0; j < pattern.length(); j++) {

                int p = pattern.charAt(j) - 'a';
                int w = words[i].charAt(j) - 'a';

                if (arrPattern[p] == 0 && arrWord[w] == 0) {
                    arrPattern[p] = words[i].charAt(j);
                    arrWord[w] = pattern.charAt(j);
                } else {
                    if (arrPattern[p] != words[i].charAt(j) ||
                        arrWord[w] != pattern.charAt(j)) {
                        value = false;
                        break;
                    }
                }
            }
            if (value) {
                ans.add(words[i]);
            }
        }
        return ans;
    }
}