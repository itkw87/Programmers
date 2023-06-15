class Solution {
    public int solution(int n) {
        int num = 0;
        int sum = 0;
        
        num = n % 2 == 0 ? 2 : 1;
        for(int i = num; i <= n; i += 2) {
            sum += num == 2 ? i * i : i; 
        }
        return sum;
    }
}