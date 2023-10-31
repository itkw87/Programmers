class Solution {
    public long solution(int price, int money, int count) {
        long lastPrice = 0;        
        for (int i = 1; i <= count; i++) {
            lastPrice += price * i; 
        }
        return lastPrice > money ? lastPrice - money : 0;
    }
}