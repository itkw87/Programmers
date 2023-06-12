class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        
        int num = k;
        for(int i = 0; i < answer.length; i++) {
            if(i == 0) {
                answer[i] = num;
            } else {
                num = num + k;
                answer[i] = num;
            }
            
        }
        
        return answer;
    }
}