import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> honorList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                honorList.add(score[i]);
            } else {
                if (score[i] > Collections.min(honorList)) {
                    honorList.remove(Collections.min(honorList));
                    honorList.add(score[i]);
                }
            }
            answer[i] = Collections.min(honorList);
        } 
        return answer;
    }
}