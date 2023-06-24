class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String str = "";
        String firstWord = "";
        int idx = 0;
        for(int i = 0; i < str_list.length; i++) {
            if(firstWord.length() == 0 && ("l".equals(str_list[i]) || "r".equals(str_list[i]))) {
                firstWord = str_list[i];
                idx = i;
            }
            str += str_list[i];
        }
        str = "l".equals(firstWord) ? str.substring(0, idx) : str.substring(idx + 1, str.length());    
        
        if(str.length() > 0) 
            answer = str.split("");
        
        return answer;
    }
}