class Solution {
    public int strStr(String haystack, String needle) {
        int hs = haystack.length();
        int ns = needle.length();
        for(int i =0; i<hs-ns+1; i++){
           if(haystack.charAt(i) == needle.charAt(0)){
            if(haystack.substring(i,ns+i).equals(needle)){
                return i;
            }

           }
        }
        return -1;
    }
}