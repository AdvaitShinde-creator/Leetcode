class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();

        long max = 0;
        long sum = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            while (seen.contains(nums[i])) {
                seen.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            seen.add(nums[i]);
            sum += nums[i];

            if (i - left + 1 == k) {
                if (sum > max) {
                    max = sum;
                }
                seen.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return max;
    }
}
