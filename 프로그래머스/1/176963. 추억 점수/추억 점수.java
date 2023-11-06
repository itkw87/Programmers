import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> nameList = new ArrayList(Arrays.asList(name));
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                int idx = nameList.indexOf(photo[i][j]);
                if (idx != -1) 
                    score += yearning[idx]; 
            }
            answer[i] = score;
        }
        return answer;
    }
}