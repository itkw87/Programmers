import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] strNumArr = String.valueOf(n).split("");
        for(int i = 0; i < strNumArr.length; i++) {
            answer += Integer.parseInt(strNumArr[i]); 
        }

        return answer;
    }
}