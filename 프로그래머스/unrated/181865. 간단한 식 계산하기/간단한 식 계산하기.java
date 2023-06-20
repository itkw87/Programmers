class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArr = binomial.split(" ");
        if("+".equals(strArr[1])) {
            answer = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
        } else if("-".equals(strArr[1])) {
            answer = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
        } else {
            answer = Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[2]);
        }
      
        return answer;
    }
}