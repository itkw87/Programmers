import java.util.Arrays;

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] ageEngArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] ageNumArr = (age + "").split("");
        
        for(int i = 0; i < ageNumArr.length; i++) {
            for(int j = 0; j < ageEngArr.length; j++) {
                if(Integer.parseInt(ageNumArr[i]) == j) {
                    answer += ageEngArr[j];
                }
            }
        }

        return answer;
    }
}