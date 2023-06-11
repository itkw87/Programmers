class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] my_stringArr = my_string.split("");
        
        for(int i = 0; i < my_stringArr.length; i++) {
            if(my_stringArr[i].equals(alp)) {
                my_stringArr[i] = my_stringArr[i].toUpperCase();
            }
            
            answer += my_stringArr[i];
        }
        
        
        
        return answer;
    }
}