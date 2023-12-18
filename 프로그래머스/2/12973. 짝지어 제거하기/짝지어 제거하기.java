import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || s.charAt(i) != stack.peek()) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == stack.peek()) {
                stack.pop();
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}