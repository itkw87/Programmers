import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String[] targetWordArr = targets[i].split("");
            int totalCnt = 0;
            for (int j = 0; j < targetWordArr.length; j++) {
                int minClickCnt = 101;
                for (int k = 0; k < keymap.length; k++) {
                    int clickKeyIdx = keymap[k].indexOf(targetWordArr[j]);
                    int realClickCnt = clickKeyIdx + 1;
                    if (clickKeyIdx != -1 && realClickCnt < minClickCnt) 
                        minClickCnt = realClickCnt;
                }
                if (minClickCnt == 101) {
                    totalCnt = 0;
                    break;
                } else {
                     totalCnt += minClickCnt;
                }
            }
            answer[i] = totalCnt == 0 ? -1 : totalCnt;
        }
        return answer;
    }
}