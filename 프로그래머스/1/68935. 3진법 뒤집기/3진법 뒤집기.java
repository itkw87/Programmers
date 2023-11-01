class Solution {
    public int solution(int n) {
        int sum = 0;
        String str = "";
        while (n > 0) {
            str += n % 3;
            n = n / 3;
        }
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i)) * (int)Math.pow(3, (str.length() - 1) - i);
        }
        return sum;
    }
}