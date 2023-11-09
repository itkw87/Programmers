class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int startSection = section[0];
        answer++;
        for (int num : section) {
            if (startSection + m > num) {
                continue;
            }
            startSection = num;
            answer++;
        }
        return answer;
    }
}