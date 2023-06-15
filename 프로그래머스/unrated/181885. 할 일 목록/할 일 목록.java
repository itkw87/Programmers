import java.util.Arrays;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        String todoStr = "";
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                todoStr += todo_list[i] + " ";
            }
        }
        answer = todoStr.split(" ");

        return answer;
    }
}