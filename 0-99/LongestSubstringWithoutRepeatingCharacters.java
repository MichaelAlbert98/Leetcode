class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int currLen = 0, maxLen = 0, j = 0;
        Set<Character> set = new HashSet<>();
        for (int i=0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            while (set.contains(c1)) {
                char c2 = s.charAt(j);
                set.remove(c2);
                currLen--;
                j++;
            }
            set.add(c1);
            currLen++;
            maxLen = maxLen >= currLen ? maxLen : currLen;
        }
        return maxLen;
    }
}