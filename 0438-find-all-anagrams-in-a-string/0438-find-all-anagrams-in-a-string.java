class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return ans;
        }
        Map<Character, Integer> patternMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (char ch : p.toCharArray()) {
            patternMap.put(ch, patternMap.getOrDefault(ch, 0) + 1);
        }
        int left = 0, right = 0;
        int requiredChars = patternMap.size(); 
        int formedChars = 0;
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);
            if (patternMap.containsKey(currentChar) && windowMap.get(currentChar).equals(patternMap.get(currentChar))) {
                formedChars++;
            }
            if (right - left + 1 == p.length()) {
                if (formedChars == requiredChars) {
                    ans.add(left);
                }
                char leftChar = s.charAt(left);
                if (patternMap.containsKey(leftChar) && windowMap.get(leftChar).equals(patternMap.get(leftChar))) {
                    formedChars--;
                }
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}