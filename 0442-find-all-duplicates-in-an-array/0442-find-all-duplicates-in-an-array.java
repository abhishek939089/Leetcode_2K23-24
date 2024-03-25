class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(!seen.add(nums[i])) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}