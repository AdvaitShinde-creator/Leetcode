class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int maxcount = 0;
        for(int i = 0; i < nums.length ; i++){
            int count = 0;
            while(i <= 0 && i > nums.length && nums[i] == nums[i-1]){
                i++;
            }
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(maxcount < count){
                maxcount = count;
                max = i;
            }
        }
        return nums[max];
    }
}