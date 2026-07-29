class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int ind = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[ind] = nums1[i];
                i++;
                ind++;
            }
            // else if(nums1[i] == nums2[j]){
            //     arr[ind] = nums1[i];
            //     i++;
            //     j++;
            //     ind++;
            // }
            else{
                arr[ind] = nums2[j];
                j++;
                ind++;
            }
        }

        while(ind < arr.length && i < nums1.length){
            arr[ind] = nums1[i];
            i++;
            ind++;
        }

        while(ind < arr.length && j < nums2.length){
            arr[ind] = nums2[j];
            j++;
            ind++;
        }

        if(arr.length % 2 == 0){
            ans = ((double)arr[(arr.length)/2] + (double)arr[(arr.length-1)/2])/2;
        }
        else{
            ans = (double)arr[arr.length/2];
        }
        return ans;
    }
}