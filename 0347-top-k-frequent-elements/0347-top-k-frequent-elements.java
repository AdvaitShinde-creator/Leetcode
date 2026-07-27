class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length <= 1){
            return nums;
        }

        Arrays.sort(nums);

        int[] ans = new int[k];
        ArrayList<Integer> freq = new ArrayList<>();
        ArrayList<Integer> ind = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            int curr = nums[i];

            while(i < nums.length && nums[i] == curr){
                count++;
                i++;
            }

            freq.add(count);
            ind.add(i - 1);   // last index of current number
            i--;
        }

        int[] freq1 = new int[freq.size()];
        int[] ind1 = new int[ind.size()];

        for(int i = 0 ; i < freq.size() ; i++){
            freq1[i] = freq.get(i);
            ind1[i] = ind.get(i);
        }

        for(int i = 0 ; i < k ; i++){
            int currmax = 0;
            int set = -1;

            for(int j = 0 ; j < freq1.length ; j++){
                if(currmax < freq1[j]){
                    currmax = freq1[j];
                    set = j;
                }
            }

            freq1[set] = -1;
            ans[i] = nums[ind1[set]];
        }

        return ans;
    }
}