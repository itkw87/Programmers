class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (isParsable(i, n)) {
                answer++;
            }
        }
        return answer;
    }
    private boolean isParsable(int i, int n) {
        int result = 0;
        for (int k = i; result + k <= n; k++) {
            result += k;
        }
        return result == n ? true : false;
    }
}