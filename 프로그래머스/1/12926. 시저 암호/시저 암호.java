class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char originChar = s.charAt(i);
           
            
            if (originChar == ' ') {
                answer += originChar;
                continue;
            }
            char changedChar;
            if ('A' <= originChar && originChar <= 'Z') {

                int changedCharNum = originChar + n;
                if (changedCharNum > 'Z') {
                    int diff = changedCharNum - 'Z';
                    changedChar = (char)(('A' - 1) + diff);
                } else {
                    changedChar = (char)(originChar + n);
                }
                 answer += changedChar;    
                
            } else if ('a' <= originChar && originChar <= 'z') {
                 int changedCharNum = originChar + n;
                if (changedCharNum > 'z') {
                    int diff = changedCharNum - 'z';
                    changedChar = (char)(('a' - 1) + diff);
                } else {
                    changedChar = (char)(originChar + n);
                }
                 answer += changedChar;    
                
            }
        }
        return answer;
    }
}