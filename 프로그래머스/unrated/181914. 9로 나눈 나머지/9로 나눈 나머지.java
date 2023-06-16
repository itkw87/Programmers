class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numStrArr = number.split("");
        
        for(int i = 0; i < numStrArr.length; i++) {
            answer += Integer.parseInt(numStrArr[i]);
        }
        return answer % 9;
    }
}