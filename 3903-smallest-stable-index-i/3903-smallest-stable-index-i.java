class Solution {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    public int firstStableIndex(int[] nums, int k) {
        int max1 = 0;
        int min1 = 0;

        for(int i = 0 ; i < nums.length ; i++){
            max1 = max(i,nums);
            min1 = min(i,nums);
            if(max1-min1 <= k){
                return i;
            }    
        }
        return -1;
    }

    public int max(int i, int[] nums){
        int ans = Integer.MIN_VALUE;
        if(i == 0){
            return nums[0];
        }

        for(int x = 0; x < i; x++){
            if(ans < nums[x]){
                ans = nums[x];
            }
        }
        return ans;
    }

    public int min(int i, int[] nums){
        int ans = Integer.MAX_VALUE;
        for(int x = i; x < nums.length; x++){
            if(ans > nums[x]){
                ans = nums[x];
            }
        }
        return ans;
    }
}