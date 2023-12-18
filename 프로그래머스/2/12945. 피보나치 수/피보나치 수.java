class Solution {
    private final int FIX_MOD_NUM = 1234567;
    public int solution(int n) {
        return f(n);
    }
    private int f(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (a + b) % FIX_MOD_NUM;
            a = b;
            b = sum;
        }
        
        return sum; 
    }
}