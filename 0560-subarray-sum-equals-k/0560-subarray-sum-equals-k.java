class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumOccurrences = new HashMap<>();
        sumOccurrences.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sumOccurrences.containsKey(sum - k)) {
                count += sumOccurrences.get(sum - k);
            }
            sumOccurrences.put(sum, sumOccurrences.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}