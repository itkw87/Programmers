import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            queue.offer((100 - progresses[i] + speeds[i] - 1) / speeds[i]);
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int day = queue.poll(); 
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= day) {
                queue.poll();
                count++;
            }            
            answerList.add(count);
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}