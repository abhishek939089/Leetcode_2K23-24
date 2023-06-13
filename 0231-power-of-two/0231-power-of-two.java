class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) {
            return false;
        }
        // return n < 0 ? false : Integer.bitCount(n) == 1;
        return Integer.bitCount(n) == 1;
    }
}