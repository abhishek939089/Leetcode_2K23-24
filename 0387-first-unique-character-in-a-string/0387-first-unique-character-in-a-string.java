class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (map.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }
}