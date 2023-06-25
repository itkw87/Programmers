class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[][] str2DArr = new String[my_string.length() / m][m];      
        int charNum = 0;
        for(int i = 0 ; i < str2DArr.length; i++) {
            String[] strArr = str2DArr[i];
            for(int j = 0; j < strArr.length; j++) {
                strArr[j] = my_string.charAt(charNum) + "";
                if(j + 1 == c) {
                    answer += strArr[j];
                }
                charNum++;
            }
        }  
        return answer;
    }
}