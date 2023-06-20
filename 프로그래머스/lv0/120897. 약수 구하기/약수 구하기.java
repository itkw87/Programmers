class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int length = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                length++;
            }          
        }
        answer = new int[length];
        int j = 0; 
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                 answer[j] = i;
                j++;
            }       
        }
        return answer;
    }
}