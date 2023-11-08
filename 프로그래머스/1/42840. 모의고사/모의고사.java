import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        Integer[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        Map<Integer, Integer> answerCntMap = new TreeMap<>();
        for (int i = 0; i < 3; i++) {
            int answerCnt = 0;
            Integer[] currentArr = (i == 0) ? arr1 : (i == 1) ? arr2 : arr3;

            for (int j = 0; j < answers.length; j++) {
                int answer = currentArr[j % currentArr.length];
                if (answer == answers[j]) {
                    answerCnt++;
                }
            }
            if (answerCnt > 0) {
                int maxCount = answerCntMap.isEmpty() ? 0 : Collections.max(answerCntMap.values());
                if (answerCnt >= maxCount) {
                    if (answerCnt > maxCount) {
                        answerCntMap.clear();
                    }
                    answerCntMap.put(i + 1, answerCnt);
                }
            }
        }
        int[] result = new int[answerCntMap.size()];
        int index = 0;
        for (int personNum : answerCntMap.keySet()) {
            result[index] = personNum;
            index++;
        }
        return result;
    }
}
