class Solution {
    public int solution(int n, String control) {
        int answer = n;
       
        String[] controlArr = control.split("");
        
        for(int i = 0; i < controlArr.length; i++) {
            if(controlArr[i].equals("w")) {
                answer += 1;
            }
            if(controlArr[i].equals("s")) {
                answer -= 1;
            }
            if(controlArr[i].equals("d")) {
                answer += 10;
            }
            if(controlArr[i].equals("a")) {
                answer -= 10;
            }       
        }
        
        
        
        return answer;
    }
}