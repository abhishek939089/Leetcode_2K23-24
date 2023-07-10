class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        for (List<Integer> row : wall) {
            int prefix = 0;
            for (int i = 0, l = row.size(); i < l; i++) {
                prefix += row.get(i);
                row.set(i, prefix);
            }
        }
        int result = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            for (int i = 0, l = row.size(); i < l - 1; i++) {
                int prefix = row.get(i);
                if (map.containsKey(prefix)) {
                    int plusOne = map.get(prefix) + 1;
                    map.put(prefix, plusOne);
                    result = Math.max(result, plusOne);
                } else {
                    map.put(prefix, 1);
                    result = Math.max(result, 1);
                }
            }
        }
        return (result == Integer.MIN_VALUE) ? wall.size() : wall.size() - result;
    }
}