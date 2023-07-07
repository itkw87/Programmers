import java.util.Arrays;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int num = 0;
        String xNumStr = "";
        String numStr = "";
        String operator = "";
        if(polynomial.contains("+")) {
            String[] strArr = polynomial.replace(" + ", "/").split("/");
            for(int i = 0; i < strArr.length; i++) {
                if(strArr[i].contains("x")) {
                    if(strArr[i].length() >= 2) {
                        xNum += Integer.parseInt(strArr[i].replace("x", ""));
                    } else if(strArr[i].length() == 1) {
                        xNum += 1;
                    }
                } else {
                    num += Integer.parseInt(strArr[i]);
                }
            }
            xNumStr = xNum >= 2 ? xNum + "x" : xNum >= 1 ? "x" : ""; 
            numStr = num >= 1 ? num + "" : "";
            operator = !"".equals(xNumStr) && !"".equals(numStr) ? " + " : "";
            answer = xNumStr + operator + numStr;
        } else {
            answer = polynomial;
        }
        return answer;
    }
}