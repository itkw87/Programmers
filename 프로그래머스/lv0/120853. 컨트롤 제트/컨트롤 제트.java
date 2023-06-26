class Solution {
    public int solution(String s) {
        int answer = 0;    
        String[] sArr = s.split(" ");  
        for(int i = 0; i < sArr.length; i++) {    
            answer = "Z".equals(sArr[i]) ? answer - Integer.parseInt(sArr[i - 1]) : answer + Integer.parseInt(sArr[i]);
        }
        return answer;
    }
}