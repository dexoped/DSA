class Solution {
    public int missingMultiple(int[] nums, int k) {
      HashSet<Integer> set = new HashSet<>();
      int missingnum =k;
      for(int num : nums){
        set.add(num);
      } 
      while(set.contains(missingnum)){
        missingnum +=k;
      }

      return missingnum;
}
}