import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i <= 9; i++) 
            answer += !Arrays.toString(numbers).contains(i + "") ? i : 0; 
        return answer;
    }
}