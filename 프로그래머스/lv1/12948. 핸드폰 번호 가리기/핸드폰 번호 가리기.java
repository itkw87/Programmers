class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String backStr = phone_number.substring(phone_number.length() - 4, phone_number.length());
        for(int i = phone_number.length() - 1; i > 3; i--) 
            answer += "*";
        
        return answer += backStr;
    }
}