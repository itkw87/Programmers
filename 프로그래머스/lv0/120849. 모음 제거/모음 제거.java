import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] wordArr = {"a", "e", "i", "o", "u"};
        String[] strArr = my_string.split("");
        
        int cnt = 0;
        for(int i = 0; i < strArr.length; i++) {
            cnt = 0;
            for(int j = 0; j < wordArr.length; j++){
                if(!strArr[i].equals(wordArr[j])){
                    cnt += 1;
                }
            }
            if(cnt == 5){
                answer += strArr[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}