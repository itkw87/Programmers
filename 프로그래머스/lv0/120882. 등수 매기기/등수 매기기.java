import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Double[] sortArr = new Double[score.length];
        for(int i = 0; i < score.length; i++) {
            sortArr[i] = (double)(score[i][0] + score[i][1]) / score[i].length;
        }
        Double[] originArr = Arrays.copyOf(sortArr, answer.length);
        Arrays.sort(sortArr, Collections.reverseOrder());
        int idx = 0;
        for(int i = 0; i < originArr.length; i++) {
            for(int j = 0; j < sortArr.length; j++) {
                if(originArr[i].equals(sortArr[j])) {
                    idx = j + 1;
                    break;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
}