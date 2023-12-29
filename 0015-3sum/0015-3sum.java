class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//         2 pointer approach TC=O(n^2) 
//         We can also do this using hashing and using one external data structure set;
        // Brute force of this code will be using 3 for loop and the time complexity of the will be approxe O(n^3) + O(no. of triplet)
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}