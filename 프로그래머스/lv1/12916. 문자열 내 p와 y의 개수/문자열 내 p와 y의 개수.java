class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if("p".equalsIgnoreCase(s.charAt(i) + "")) {
                pCnt++;
            } else if("y".equalsIgnoreCase(s.charAt(i) + "")) {
                yCnt++;
            }  
        }
        answer = pCnt == yCnt ? true : false;
        return answer;
    }
}