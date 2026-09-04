class Solution {
    public int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length ; i++){
            if(nums[i]%2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        
        int start = 0;
        int end = nums.length-1;
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 0){
                arr[start] = 0;
                start++;
            }
            else{
                arr[end]=1;
                end--;
            }
        }

        return arr;
    }
}