class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int total2 = 0;
        int[] ans = new int[nums.length];
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            total *= nums[i];
            if(nums[i] == 0){
                count++;
            }
            if(nums[i] != 0 && total2 == 0 && count < 2){
                total2 = 1;
            }
            if(nums[i] != 0){
                total2 *= nums[i];
            }
        }

        if(count > 1){
            total2 = 0;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                ans[i] = total2;
            }
            else{
                ans[i] = total/nums[i];
            }
        }
        return ans;
    }
}