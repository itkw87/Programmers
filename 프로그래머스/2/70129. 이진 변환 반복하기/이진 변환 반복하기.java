class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!"1".equals(s)) {
            int newStrLen = s.replace("0", "").length();
            int diffCnt = s.length() - newStrLen; 
            StringBuilder sb = new StringBuilder();
            while(newStrLen / 2 > 0) {
                    sb.append(newStrLen % 2);
                    newStrLen = newStrLen / 2;
            }
            sb.append(newStrLen);
            s = sb.reverse().toString();
            answer[0]++;
            answer[1] += diffCnt;
        }
        return answer;
    }
}