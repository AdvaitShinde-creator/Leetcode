class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                ans = Math.abs(i - start);
            }
            if(min > ans){
                min = ans;
            }
        }
        return min;
    }
}