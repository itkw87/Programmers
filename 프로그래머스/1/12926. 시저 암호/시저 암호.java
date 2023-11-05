class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char originChar = s.charAt(i);
            if (!Character.isLetter(originChar)) {
                answer.append(originChar);
                continue;
            }
            char changedChar = 0;
            int changedCharNum = 0;
            int diff = 0;
            if ('A' <= originChar && originChar <= 'Z') {
                changedCharNum = originChar + n;
                if (changedCharNum > 'Z') {
                    diff = changedCharNum - 'Z';
                    changedChar = (char)(('A' - 1) + diff);
                } else {
                    changedChar = (char)(originChar + n);
                }
            } else if ('a' <= originChar && originChar <= 'z') {
                changedCharNum = originChar + n;
                if (changedCharNum > 'z') {
                    diff = changedCharNum - 'z';
                    changedChar = (char)(('a' - 1) + diff);
                } else {
                    changedChar = (char)(originChar + n);
                }
            }
            answer.append(changedChar);  
        }
        return answer.toString();
    }
}