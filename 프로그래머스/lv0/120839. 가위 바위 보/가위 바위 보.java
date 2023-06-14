class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] strArr = rsp.split("");
        
        for(int i = 0; i < strArr.length; i++) {
            if("2".equals(strArr[i])) {
                answer += "0";
            } 
            if("0".equals(strArr[i])) {
                answer += "5";
            }
            if("5".equals(strArr[i])) {
                answer += "2";
            }
        }
        return answer;
    }
}