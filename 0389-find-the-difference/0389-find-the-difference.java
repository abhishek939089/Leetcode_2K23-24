class Solution {
    public char findTheDifference(String s, String t) {
        char unique = 0;
        for(int i=0; i<s.length(); i++) {
            unique ^= s.charAt(i);
        }
        for(int i=0; i<t.length(); i++) {
            unique ^= t.charAt(i);
        }
        return unique;
    }
}