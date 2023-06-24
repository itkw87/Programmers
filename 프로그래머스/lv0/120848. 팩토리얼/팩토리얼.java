class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 1;

        int i = 2;
        while(result <= n) {
            answer = i;
            result = result * i;
            i++;
        }
        return --answer;
    }
}