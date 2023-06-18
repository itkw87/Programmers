class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean flag = false;
        for(int i = 1; i <= n; i++) {
            if(n % i == 1) {
                flag = true;
                answer = i;
                break;
            }
        }
       
        if(!flag) {
            answer = n - 1;
        }
       
        return answer;
    }
}