class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        String newStr = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(i != my_string.length() - 1 && !" ".equals(my_string.charAt(i) + "") && " ".equals(my_string.charAt(i + 1) + "")) {
                newStr += my_string.charAt(i) + " ";
            } else if(!" ".equals(my_string.charAt(i) + "")) {
                newStr += my_string.charAt(i) + "";
            }
        }
        
        answer = newStr.split(" ");
    
        return answer;
    }
}