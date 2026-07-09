class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxcount = 0;
        int j = 1;
        int i = 0;
        while(i < nums.length){
            int count = 1;
            while(i < nums.length && j < nums.length && nums[i] < nums[j]){
                count++;
                i++;
                j++;
            }
            i++;
            j++;
            if(count > maxcount){
                maxcount = count;
            }
        }
        return maxcount;
    }
}