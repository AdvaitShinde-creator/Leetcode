class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        HashSet<Integer> seen = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            seen.add(nums[i]);
        }

        for(int i = 0 ; i < n ; i++){
            int find = target - nums[i];
            if(seen.contains(find)){
                ans[0] = i+1;
                for(int j = 0 ; j < n ; j++){
                    if(i != j && nums[j] == find){
                        ans[1] = j+1;
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}