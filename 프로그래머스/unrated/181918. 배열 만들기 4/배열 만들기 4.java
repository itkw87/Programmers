import java.util.Stack;
class Solution {
    public Stack solution(int[] arr) {       
        int i = 0;
        Stack<Integer> s = new Stack<>();
        while (i < arr.length) {
            if (s.size() == 0) {
                s.push(arr[i++]);
            } else if (s.size() > 0 && s.peek() <  arr[i]) {
                s.push(arr[i++]);
            } else if (s.size() > 0 && s.peek() >=  arr[i]) {
                s.pop();     
            }
        }                 
        return s;
    }
}