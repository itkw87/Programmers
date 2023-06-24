class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newStr = "";
        for(int i = 0; pat.length() + i <= myString.length(); i++) {  
            newStr = myString.substring(i, pat.length() + i);
            answer += newStr.equals(pat) ? 1 : 0;
        }
        return answer;
    }
}