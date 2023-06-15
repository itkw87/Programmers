import java.util.Arrays;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        
        System.out.println(answer.length);
        
        int idx = 0;
        for(int i = 0; i < names.length; i += 5) {
            answer[idx] = names[i];
            idx++;
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}