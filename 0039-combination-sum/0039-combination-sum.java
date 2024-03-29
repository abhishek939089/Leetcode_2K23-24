class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }

    private static void backtrack(List<List<Integer>> results,List<Integer> tempList,int[]              candidates,int remaining, int start) {
        if (remaining < 0) {
            return;
        } else if (remaining == 0) {
            results.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(results, tempList, candidates, remaining - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}