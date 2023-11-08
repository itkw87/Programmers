import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisorsCount = new int[number + 1];
        for (int i = 1; i <= number; i++) {  
            for (int j = i; j <= number; j += i) {
                divisorsCount[j]++;
            }
        }
        for (int i = 1; i <= number; i++) {
            answer += (divisorsCount[i] > limit) ? power : divisorsCount[i];
        }
        return answer;
    }
}
