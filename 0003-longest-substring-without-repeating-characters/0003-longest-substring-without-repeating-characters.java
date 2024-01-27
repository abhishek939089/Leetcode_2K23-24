class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxSubstringLength = 0;
        HashMap<Character, Integer> charIdxMap = new HashMap<>();
        while (right < n) {
            char currentChar = s.charAt(right);

            if (charIdxMap.containsKey(currentChar) && charIdxMap.get(currentChar)>=
                left) {
                left = charIdxMap.get(currentChar) + 1;
            }
            charIdxMap.put(currentChar, right);
            maxSubstringLength = Math.max(maxSubstringLength, right - left + 1);
            right++;
        }
        return maxSubstringLength;
    }
}