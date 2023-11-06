import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> sumSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                 sumSet.add(numbers[i] + numbers[j]);                    
                }
            }
        }
        Integer[] answer = sumSet.toArray(new Integer[sumSet.size()]);
        Arrays.sort(answer);
        return answer;
    }
}