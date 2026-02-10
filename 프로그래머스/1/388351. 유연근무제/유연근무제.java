import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for (int i = 0; i < schedules.length; i++) {
            boolean isFail = false;
            int currday = startday;
            int lmitTime = schedules[i] + 10;
            if (lmitTime % 100 >= 60) {
                lmitTime += 40;
            }
            for (int j = 0; j < timelogs[i].length; j++) {
                if (Arrays.asList(6, 7).indexOf(currday) == -1 && lmitTime < timelogs[i][j]) {
                    isFail = true;
                    break;
                }                
                currday = currday == 7 ? 1 : currday + 1;
            }
            if (!isFail) answer++;
        }
        return answer;
    }
}