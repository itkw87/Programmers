import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";        
        List<String> card1List = new ArrayList(Arrays.asList(cards1));
        List<String> card2List = new ArrayList(Arrays.asList(cards2));
        for (int i = 0; i < goal.length; i++) {
            if (card1List.indexOf(goal[i]) == 0) {
                card1List.remove(0);
            } else if (card2List.indexOf(goal[i]) == 0) {
                card2List.remove(0);
            } else {
                answer = "No";
            }
        }    
        return answer;
    }
}