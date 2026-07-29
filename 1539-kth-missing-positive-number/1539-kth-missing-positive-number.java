class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> seen = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++){
            seen.add(arr[i]);
        }

        int count = 0;

        for(int i = 1 ; i < Integer.MAX_VALUE ; i++){
            if(seen.contains(i)){
                continue;
            }
            count++;
            if(count == k){
                return i;
            }
        }
        return 0;
    }
}