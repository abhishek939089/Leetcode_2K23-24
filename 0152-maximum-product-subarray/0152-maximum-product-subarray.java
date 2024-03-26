class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        
        for (int i = 1; i < n; i++) {
            int tempMax = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
            int tempMin = Math.min(nums[i], Math.min(maxProduct * nums[i], minProduct * nums[i]));
            
            maxProduct = tempMax;
            minProduct = tempMin;
            
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}