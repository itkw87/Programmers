import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!stack.empty() && stack.peek() == arr[i]) {
                continue;
            }
            stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        for (int j = answer.length - 1; j >= 0 ; j--) {
            answer[j] = stack.pop();
        }
        return answer;
    }
}