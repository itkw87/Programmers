import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        myString = myString.endsWith("x") ? myString + " " : myString;
        
        String[] strArr = myString.split("x");
        answer = new int[strArr.length];
        
        System.out.println(Arrays.toString(strArr));
        
        for(int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i].length());
            if(!" ".equals(strArr[i])){
                answer[i] = strArr[i].length();
            } else {
                answer[i] = 0;
            }
            
        }
        
        return answer;
    }
}