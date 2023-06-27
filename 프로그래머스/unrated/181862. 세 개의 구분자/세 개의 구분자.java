import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {"EMPTY"};
        StringBuilder sb = new StringBuilder();
        
        String[] arr = myStr.split("[a|b|c]"); 
        if(arr.length != 0){
            answer = arr;
            for(int i = 0; i < answer.length; i++) {
                if(!"".equals(answer[i])) {
                   sb.append(answer[i] + " ");
                }              
            }
            answer = sb.toString().trim().split(" ");
        }
        return answer;
    }
}