import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int[] ans = new int[nums.length];
        int ind = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            ans[ind] = nums[i];
            ind++;
        }

        if (ind < 3) {
            return ans[ind - 1];
        }

        return ans[ind - 3];
    }
}