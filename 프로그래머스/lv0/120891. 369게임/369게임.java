class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] strArr = (order + "").split("");
        for(int i = 0; i < strArr.length; i++) {
            if(!"0".equals(strArr[i]) && (Integer.parseInt(strArr[i])) % 3 == 0) {
                answer++;
            } 
        }
        return answer;
    }
}