class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, new HashSet(wordDict), 0, new Boolean[s.length()]);
    }
    public boolean dfs(String s, Set<String> wordDict, int start, Boolean[] memoi) {
        if (start == s.length()) {
            return true;
        }
        if (memoi[start] != null) {
            return memoi[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && dfs(s, wordDict, end, memoi)) {
                    return memoi[start] = true;
            }
        }
        return memoi[start] = false;
    }
}