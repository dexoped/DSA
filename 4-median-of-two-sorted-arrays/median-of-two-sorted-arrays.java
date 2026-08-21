class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        double median = 0;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                merged[k] = nums1[i];
                i--;
            }
            else{
                merged[k] = nums2[j];
                j--;;

            }
            k--;
        }
        while (i >= 0) {
         merged[k] = nums1[i];
         i--;
         k--;
}

        int len = merged.length;

       
        if(len%2 == 0){
                median = (merged[len / 2 - 1] + merged[len / 2]) / 2.0;
        } else {
            median = merged[len / 2];
             }   
        return median;
    }
}