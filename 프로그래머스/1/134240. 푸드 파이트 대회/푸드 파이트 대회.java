class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 1; j <= food[i] / 2; j++) {
                sb.append(i);               
            }
        }
        answer += sb;
        return answer += "0" + sb.reverse();
    }
}