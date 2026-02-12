import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        
        int preNum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (preNum != arr[i]) {
                queue.offer(arr[i]);    
                preNum = arr[i];
            }
        }
        
        int idx = 0;
        int[] answer = new int[queue.size()];
        while (!queue.isEmpty()) {
            answer[idx++] = queue.poll();   
        }

        return answer;
    }
}