class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0')*(num2.charAt(j) - '0');
                int sum = product + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int digit : result) {
            if (!(s.length() == 0 && digit == 0)) {
                s.append(digit);
            }
        }
        return s.length() == 0 ? "0" : s.toString();
    }
}