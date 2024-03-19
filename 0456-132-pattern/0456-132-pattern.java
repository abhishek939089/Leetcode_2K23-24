class Solution {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int[] minSoFar = new int[nums.length];
        minSoFar[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            minSoFar[i] = Math.min(minSoFar[i - 1], nums[i]);
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > minSoFar[j]) {
                while (!stack.isEmpty() && stack.peek() <= minSoFar[j]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }
                stack.push(nums[j]);
            }
        }
        return false;
    }
}