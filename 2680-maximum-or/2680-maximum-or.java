class Solution {
    public long maximumOr(int[] nums, int k) {
        final int n = nums.length;
        long count = 0;
        long[] prefix = new long[n];
        long[] suffix = new long[n];

        for (int i = 1; i < n; ++i) {
            prefix[i] = prefix[i - 1] | nums[i - 1];
        }
        for (int i = n - 2; i >= 0; --i) {
            suffix[i] = suffix[i + 1] | nums[i + 1];
        }
        for (int i = 0; i < n; ++i) {
            count = Math.max(count, prefix[i] | (long) nums[i] << k | suffix[i]);
        }
        return count;
    }
}