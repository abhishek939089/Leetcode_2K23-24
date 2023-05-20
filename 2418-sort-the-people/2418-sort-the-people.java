class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; ++i) {
            idx[i] = i;
        }
        Arrays.sort(idx, (i, j) -> heights[j] - heights[i]);
        String[] abhi = new String[n];
        for (int i = 0; i < n; ++i) {
            abhi[i] = names[idx[i]];
        }
        return abhi;
    }
}