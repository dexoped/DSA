class Solution {
    public int firstUniqChar(String s) {
    int unique = Integer.MAX_VALUE;

    for (char ch = 'a'; ch <= 'z'; ch++) {
        int index = s.indexOf(ch);

        if (index != -1 && index == s.lastIndexOf(ch)) {
            unique = Math.min(unique, index);
        }
    }

    return unique == Integer.MAX_VALUE ? -1 : unique;
}
    }
