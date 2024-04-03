class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        backtrack(ansList, new ArrayList<>(), nums);
        return ansList;
    }
    private void backtrack(List<List<Integer>> ansList, ArrayList<Integer> tempList, int[] nums) {
        if(tempList.size() == nums.length) {
            ansList.add(new ArrayList<>(tempList));
            return;
        }
        for(int number:nums) {
            if(tempList.contains(number)) {
                continue;
            }
            
            tempList.add(number);
            
            backtrack(ansList, tempList, nums);
            
            tempList.remove(tempList.size() - 1);
        }
    }
}