import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> playerMap = new LinkedHashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        
        for (String currentPlayer : callings) {
            int currentIdx = playerMap.get(currentPlayer);
            String changePlayer = players[currentIdx - 1];
            

            playerMap.put(currentPlayer, currentIdx - 1);
            playerMap.put(changePlayer, currentIdx);
            players[currentIdx] = changePlayer;
            players[currentIdx - 1] = currentPlayer;
        }
        
       
        return players;
    }
}