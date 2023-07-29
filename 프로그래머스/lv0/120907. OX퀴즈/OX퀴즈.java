import java.util.Arrays;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length] ;
        String operator = "";
        final String PLUS = " \\+ ";
        final String MINUS = " - ";
        String[] equalsOpArr = {};
        String[] operatorArr = {};   
        for(int i = 0; i < quiz.length; i++) {
            equalsOpArr = quiz[i].split(" = ");         
            operator = equalsOpArr[0].contains(" + ") ? PLUS : equalsOpArr[0].contains(" - ") ? MINUS : "";
            operatorArr = equalsOpArr[0].split(operator);
            switch (operator) {
                case PLUS:
                    answer[i] = (Integer.parseInt(operatorArr[0]) + Integer.parseInt(operatorArr[1])) == Integer.parseInt(equalsOpArr[1]) ? "O" : "X";
                    break;
                case MINUS:
                    answer[i] = (Integer.parseInt(operatorArr[0]) - Integer.parseInt(operatorArr[1])) == Integer.parseInt(equalsOpArr[1]) ? "O" : "X";
            }         
        }     
        return answer;
    }
}