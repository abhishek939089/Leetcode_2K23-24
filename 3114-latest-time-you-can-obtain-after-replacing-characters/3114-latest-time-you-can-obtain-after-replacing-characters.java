class Solution {
    public String findLatestTime(String s) {
        char[] ans = s.toCharArray();

        if (ans[0] == '?') {
            if (ans[1] == '?' || (ans[1] >= '0' && ans[1] <= '9')) {
                ans[0] = (ans[1] <= '1' || ans[1] == '?') ? '1' : '0';
            }
        }

        if (ans[1] == '?') {
            ans[1] = (ans[0] == '1') ? '1' : '9';
        }

        if (ans[3] == '?') {
            ans[3] = '5';
        }

        if (ans[4] == '?') {
            ans[4] = '9';
        }
        return new String(ans);
    }
}