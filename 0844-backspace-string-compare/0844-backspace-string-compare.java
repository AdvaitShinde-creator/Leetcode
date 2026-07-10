class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder arr1 = new StringBuilder(s);
        StringBuilder arr2 = new StringBuilder(t);

        // Process first string
        for (int i = 0; i < arr1.length();) {
            if (arr1.charAt(i) == '#') {
                if (i == 0) {
                    // No previous character to delete
                    arr1.deleteCharAt(i);
                } else {
                    // Delete previous character and '#'
                    arr1.delete(i - 1, i + 1);
                    i--;
                }
            } else {
                i++;
            }
        }

        // Process second string
        for (int i = 0; i < arr2.length();) {
            if (arr2.charAt(i) == '#') {
                if (i == 0) {
                    arr2.deleteCharAt(i);
                } else {
                    arr2.delete(i - 1, i + 1);
                    i--;
                }
            } else {
                i++;
            }
        }

        return arr1.toString().equals(arr2.toString());
    }
}