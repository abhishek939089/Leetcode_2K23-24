class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1[1], p2[1]));
        int currentEnd = points[0][1];
        int count = 1;
        for (int[] p : points) {
            if (p[0] > currentEnd) {
                count++;
                currentEnd = p[1];
            } else {
                continue;
            }
        }
        return count;
    }
}