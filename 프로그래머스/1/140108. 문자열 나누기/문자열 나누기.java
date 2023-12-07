class Solution {
    public int solution(String s) {
        int answer = 0;
        int oCnt = 0;
        int xCnt = 0;
        boolean flag = false;
        String firstWord = s.charAt(0) + "";
        for (int i = 0; i < s.length(); i++) {
            if (flag) {
                firstWord = s.charAt(i) + "";
                flag = false;
            }
            if (firstWord.equals(s.charAt(i) + "")) {
                oCnt++;
            } else {
                xCnt++;                
            }
             if (oCnt != 0 && xCnt!= 0 && oCnt == xCnt) {
                flag = true;
                oCnt = 0;
                xCnt = 0;
                answer++;
            }
             if (i == s.length() - 1 && oCnt != xCnt) 
                answer++;
        }
        return answer;
    }
}