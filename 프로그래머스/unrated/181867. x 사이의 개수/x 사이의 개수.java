class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        myString = myString.endsWith("x") ? myString + " " : myString;
        String[] strArr = myString.split("x");
        answer = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            if(!" ".equals(strArr[i])){
                answer[i] = strArr[i].length();
            } else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
}