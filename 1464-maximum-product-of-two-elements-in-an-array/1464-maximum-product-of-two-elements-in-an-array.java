class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int ind = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(max1 < nums[i]){
                max1 = nums[i];
                ind = i;
            }
        }

        nums[ind] = -1;

        for(int i = 0 ; i < nums.length ; i++){
            if(max2 < nums[i]){
                max2 = nums[i];
            }
        }
        return (max2-1)*(max1-1);
    }
}