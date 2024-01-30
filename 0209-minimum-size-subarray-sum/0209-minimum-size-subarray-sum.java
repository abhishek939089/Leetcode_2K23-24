class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, left = 0, ans = Integer.MAX_VALUE, window = 0;
        for(int right = 0; right < n; right++) {
            window += nums[right];
            while(window >= target) {
                ans = Math.min(ans, right - left + 1);
                window -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}