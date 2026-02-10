class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int wletMaxNum = Math.max(wallet[0], wallet[1]);
        int wletMinNum = Math.min(wallet[0], wallet[1]);
        int billMaxNum = Math.max(bill[0], bill[1]);
        int billMinNum = Math.min(bill[0], bill[1]);
        while (wletMinNum < billMinNum || wletMaxNum < billMaxNum) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            wletMaxNum = Math.max(wallet[0], wallet[1]);
            wletMinNum = Math.min(wallet[0], wallet[1]);
            billMaxNum = Math.max(bill[0], bill[1]);
            billMinNum = Math.min(bill[0], bill[1]);
            answer++;
        }
        return answer;
    }
}