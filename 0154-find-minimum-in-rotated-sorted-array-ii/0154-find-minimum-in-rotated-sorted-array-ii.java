class Solution {
    public int findMin(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}