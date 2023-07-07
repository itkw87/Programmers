class Solution {
    public String solution(String polynomial) {
        int xNum = 0;
        int num = 0;
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
            return (xNum >= 2 ? xNum + "x" : xNum >= 1 ? "x" : "") + (xNum != 0 && num != 0 ? " + " : "") + (num >= 1 ? num + "" : "");
        } else {
            return polynomial;
        }
    }
}