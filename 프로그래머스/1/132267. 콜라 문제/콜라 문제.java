class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int givedCoke = n / a * b;
            int notChangedCoke = n % a;
            n = givedCoke + notChangedCoke;
            answer += givedCoke;
        }
        return answer;
    }
}