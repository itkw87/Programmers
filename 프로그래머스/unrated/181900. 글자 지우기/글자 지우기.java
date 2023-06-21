class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        boolean flag = false;
        for(int i = 0; i < my_string.length(); i++) {
            flag = true;
            for(int j = 0; j < indices.length; j++) {
                if(i == indices[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag)
            answer +=  my_string.charAt(i) + "";
        }
        
        return answer;
    }
}