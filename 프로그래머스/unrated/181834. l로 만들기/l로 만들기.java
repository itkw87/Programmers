class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            answer += (int)myString.charAt(i) < (int)'l' ? "l" : myString.charAt(i) + "";
        }
        return answer;
    }
}