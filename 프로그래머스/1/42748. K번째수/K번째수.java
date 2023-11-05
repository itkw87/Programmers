import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tempArr = {};
        for (int i = 0; i < commands.length; i++){
            int[] command = commands[i];
            tempArr = new int[(command[1] - command[0]) + 1];
            for (int j = command[0] - 1, t = 0; j < command[1]; j++, t++) {
                tempArr[t] = array[j];
            }
            Arrays.sort(tempArr);
            answer[i] = tempArr[command[2] - 1];
        }
        return answer;
    }
}