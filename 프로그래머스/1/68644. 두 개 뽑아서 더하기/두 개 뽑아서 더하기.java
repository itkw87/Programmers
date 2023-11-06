import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        Set<Integer> sumSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                 sumSet.add(numbers[i] + numbers[j]);                    
                }
            }
        }
        answer = new int[sumSet.size()];
        int index = 0;
        for (int sum : sumSet) {
            answer[index++] = sum;
        }
        Arrays.sort(answer);
        return answer;
    }
}