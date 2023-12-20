import java.util.*;

class Solution {
    // 끝말잇기 조건
    // 1. 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야함
    // 2. 이전에 등장한 단어는 사용불가
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Map<String, Integer> wordsMap = new LinkedHashMap<>();
        int turnCnt = 1;
        int currentPlayer = 1;
        char prevLastChar = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentPlayer > n) 
               currentPlayer = 1;
            if (wordsMap.getOrDefault(currentWord, 0) == 1 || currentWord.charAt(0) != prevLastChar) {
                answer[0] = currentPlayer;
                answer[1] = turnCnt;
                break;
            } 
            wordsMap.put(currentWord, 1);
            prevLastChar = currentWord.charAt(currentWord.length() - 1);
            currentPlayer++;
            if ((i + 1) % n == 0) 
                turnCnt++; 
        }
        return answer;
    }
}