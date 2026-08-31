class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int avg = 0;
        int count = 0;
        int start = 0;

        for(int i = 0 ; i < k; i++){
            sum += arr[i];
        }

        avg = sum/k;

        if(avg >= threshold){
            count++;
        }

        for(int i = k ; i < arr.length ; i++){
            sum += arr[i];
            sum -= arr[start];
            avg = sum/k;
            start++;

            if(avg >= threshold){
                count++;
            }
        }
        return count;
    }
}