class Solution {
    public int numSquares(int n) {
        int ans = n, num =2;
        while(num * num <=n){
            int x = n / (num * num), y = n % (num * num);
            ans = Math.min(ans, x + numSquares(y));
            ++num;
        }
        return ans;
    }
}