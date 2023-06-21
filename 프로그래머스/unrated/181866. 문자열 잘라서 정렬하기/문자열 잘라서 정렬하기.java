import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {     
        myString = myString.replaceAll("x{2,}" ,"x");
  
        if(myString.charAt(0) == 'x') {
            myString = myString.substring(1, myString.length());
        }
        String[] answer = myString.split("x");   
        Arrays.sort(answer);

        return answer;
    }
}