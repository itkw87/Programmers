class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;

        int[] intArr = new int[box.length];
        for(int i = 0; i < box.length; i++) {
            answer *= box[i] / n;
        }
        
        return answer;
    }
}