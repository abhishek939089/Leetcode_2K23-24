class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // int len = nums.length;
        // int i = 0;
        // while(i < len - 1) {
        //     if(nums[i] == nums[i+1]) {
        //         i = i+2;
        //     }else {
        //         return nums[i];
        //     }
        // }
        // return nums[len - 1]; //by default it will return last element of sorted array id it does't find any non-duplicate number
        // int ans = 0;
        // for(int number : nums) {
        //     ans ^= number;
        // }
        // return ans;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums) {
            if(map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}