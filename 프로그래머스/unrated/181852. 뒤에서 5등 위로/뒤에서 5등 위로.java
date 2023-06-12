import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
         
        int temp = 0;
        for(int j = 0; j < num_list.length; j++) {
            for(int i = 0; i < num_list.length - 1; i++) {
            temp = num_list[i];
                if(num_list[i] > num_list[i + 1]) {
                    num_list[i] = num_list[i + 1];
                    num_list[i + 1] = temp;
                }
            }
        }
        
        for(int g = 0; g < answer.length; g++) {
            answer[g] = num_list[g+5];
        }
        
        return answer;
    }
}