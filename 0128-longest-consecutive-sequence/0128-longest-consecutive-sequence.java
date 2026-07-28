class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            // Check if consecutive
            if (nums[i] == nums[i - 1] + 1) {
                currentLen++;
            } else {
                // Sequence broken, reset
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }

        return Math.max(maxLen, currentLen);
    }
}