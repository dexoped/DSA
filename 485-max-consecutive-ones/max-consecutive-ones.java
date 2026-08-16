class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int freq = 0;
        int max =0;
        for(int i =0; i< n; i++){
            
            if(nums[i] == 1){
                freq++;
                max = Math.max(max, freq);
            }else{
                freq = 0;
            }
        }
        return max;
    }
}