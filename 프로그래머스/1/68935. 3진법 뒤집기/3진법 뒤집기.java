class Solution {
    public int solution(int n) {
        int base3 = 3;
        Integer.toString(n, base3);
        String trnsBase3 = Integer.toString(n, base3);
        String trnsBase3Rvrs = new StringBuilder(trnsBase3).reverse().toString();
        
        return Integer.parseInt(trnsBase3Rvrs, base3);
    }
}