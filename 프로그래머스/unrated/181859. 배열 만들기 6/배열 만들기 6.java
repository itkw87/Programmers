import java.util.Stack;
class Solution {
    public Stack solution(int[] arr) {
        Stack s = new Stack(); 
        int i = 0;
        while (i < arr.length) {
            if(s.empty()) 
                s.push(arr[i++]);
             else if (!s.empty() && (int)(s.peek()) != arr[i]) 
                s.push(arr[i++]);
             else if (!s.empty() && (int)(s.peek()) == arr[i]) {
                s.pop();
                i++;
            } 
        }
        if(s.empty())
            s.push(-1);
        return s;
    }
}