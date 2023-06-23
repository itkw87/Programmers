import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            cnt = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j))      
                    cnt++;
            } 
           if(cnt == 1) 
               answer += s.charAt(i);
        }        
        String[] strArr = answer.split("");
        Arrays.sort(strArr);
        return Arrays.toString(strArr).replaceAll("[^a-z]", "");
    }
}