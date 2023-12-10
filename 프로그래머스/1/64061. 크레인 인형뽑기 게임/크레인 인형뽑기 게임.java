import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dollStack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int[] boa : board) {
                int currColPick = boa[moves[i] - 1];
                if (currColPick != 0) {
                      if (dollStack.size() > 0) {
                          if (dollStack.peek() == currColPick) {
                              dollStack.pop();
                              answer += 2;
                          } else {
                              dollStack.push(currColPick);
                          }
                      } else {
                          dollStack.push(currColPick);
                      }
                      boa[moves[i] - 1] = 0;
                      break;    
                }
            }
        }
        return answer;
    }
    
   
}