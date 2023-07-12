class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for(int i = a;  i >= 2; i--) {
            if(a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i; 
                break;
            }
        }
        boolean flag;
        for(int i = 2; i <= b; i++) {
            flag = true;
            if(b % i == 0) {
                for(int j = 2; j < i; j++) {
                    if(i % j == 0) { 
                        flag = false; 
                        break;
                    }
                }
                if(flag && i != 2 && i != 5) { 
                    answer = 2;
                    break;
                }
            }
        }
        return answer;
    }
}