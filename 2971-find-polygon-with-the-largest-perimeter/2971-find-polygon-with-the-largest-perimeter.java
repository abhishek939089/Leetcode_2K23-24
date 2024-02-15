class Solution {
    public long largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n < 3) return -1;
        
        long sum = 0;
        int i = 0;
        while(i < n) {
            sum += nums[i];
            if(i == n-2) {
                break;
            }
            i++;
        }
        if(sum > nums[n-1]) {
            return sum + nums[n-1];
        }
        else {
            while(i >= 2) {
                long temp = sum;
                temp = temp - nums[i];
                if(temp > nums[i])
                {
                    return sum;
                }
                sum -= nums[i];
                i--;
            }
        }
        return -1;
    }
}