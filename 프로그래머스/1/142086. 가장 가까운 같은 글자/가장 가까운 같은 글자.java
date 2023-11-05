import java.util.*;
class Solution {
    public int[] solution(String s) {
        String checkStr = "";        
        List<String> list = new ArrayList<>();
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            checkStr = s.charAt(i) + "";
            if (!list.contains(checkStr)) {
                answer[i] = -1;
            } else {
                answer[i] = i - list.lastIndexOf(checkStr);
            }
            list.add(checkStr);
        }
        return answer;
    }
}