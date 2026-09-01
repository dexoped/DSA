class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] lrd = new int[nums.length];

        for(int i =1; i<n; i++){
            left[i] = left[i-1] + nums[i-1];
        }
        for(int j = n-2; j>=0; j--){
            right[j] = right[j+1] + nums[j+1];
        }
        for(int i =0; i<n; i++){
            lrd[i] = Math.abs(left[i] - right[i]);
        }

        return lrd;
    }
}