import java.util.Arrays;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int num = 0;
        int cnt = 0;
        int g = 0;
        
        for(int i = 0; i < intStrs.length; i++) {
            num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(num > k) 
                cnt++;
        }
        answer = new int[cnt];

        for(int i = 0; i < intStrs.length; i++) {
            num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(num > k && g < answer.length) {
                answer[g] = num; 
                g++;
            }
        }                                    
        return answer;
    }
}