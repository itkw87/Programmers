import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};

        int cnt = 0;  
        for(int i = 0; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) < 97) { 
                cnt ++;
            }
        }  
        answer = new int[cnt];
        
        int j = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) < 97) {          
                answer[j] = Integer.parseInt(my_string.charAt(i) + "");
                j++;
            }
        }
        
        boolean flag = false;
        int temp2 = 0;
        do {
            flag = true;
            for(int i = 0; i < answer.length - 1; i++) {
                if(answer[i] > answer[i + 1]) {
                    temp2 = answer[i + 1];
                    answer[i + 1] = answer[i];
                    answer[i] = temp2;     
                    flag = false;
                }
            }    
        } while(!flag);

        return answer;
    }
}