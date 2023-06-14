class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        int realIdx = 0;
        for(int i = 0; i < n_str.length(); i++) {
            if(!"0".equals(n_str.charAt(i) + "")) {
                realIdx = i;        
                break;
            }
        }
        answer = n_str.substring(realIdx);
        return answer;
    }
}