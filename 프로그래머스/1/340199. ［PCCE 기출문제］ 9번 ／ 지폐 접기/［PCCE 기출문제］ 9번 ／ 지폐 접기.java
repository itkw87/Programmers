class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while (min(wallet) < min(bill) || max(wallet) < max(bill)) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer++;
        }
        return answer;
    }
    
    private int max(int[] numArr) {
        return Math.max(numArr[0], numArr[1]);
    }
    
    private int min(int[] numArr) {
        return Math.min(numArr[0], numArr[1]);
    }
}