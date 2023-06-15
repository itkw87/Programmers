import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {      
        String[] answer = {};
        
        String str = "";
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")){
                str += strArr[i] + " ";
            }
        }
        answer = str.trim().split(" ");
    
        return answer;
    }
}