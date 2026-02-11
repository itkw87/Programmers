import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scoreArr = new int[3];
        scoreArr[0] = countAnswer(arr1, answers);
        scoreArr[1] = countAnswer(arr2, answers);
        scoreArr[2] = countAnswer(arr3, answers);
        
        int maxScore = Math.max(scoreArr[0], Math.max(scoreArr[1], scoreArr[2]));
        
        List<Integer> list = new ArrayList<>();
        
        if (maxScore == scoreArr[0]) list.add(1);
        if (maxScore == scoreArr[1]) list.add(2);
        if (maxScore == scoreArr[2]) list.add(3);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    private int countAnswer(int[] checkAnswer, int[] resultAnswer) {
        int count = 0;
        for (int i = 0; i < resultAnswer.length; i++) {
            if (resultAnswer[i] == checkAnswer[i % checkAnswer.length]) {
                count++;   
            }
        }
        return count;
    }
}


