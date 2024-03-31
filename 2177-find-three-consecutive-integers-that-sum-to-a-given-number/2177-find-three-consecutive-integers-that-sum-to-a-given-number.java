class Solution {
    public long[] sumOfThree(long num) {
        long answer[] = new long[3];
        
        if(num%3 != 0) {
            return new long[]{};
        }
        answer[0] = num/3 - 1;
        answer[1] = num/3;
        answer[2] = num/3 + 1;
        return answer;
    }
}