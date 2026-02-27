class Solution {
    public long solution(int n) {
        if (n <= 2) return n;
        
        long[] fiboArr = new long[n + 1];
        fiboArr[1] = 1;
        fiboArr[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            fiboArr[i] = (fiboArr[i - 2] + fiboArr[i - 1]) % 1234567;
        }   
        return fiboArr[n];
    }
}