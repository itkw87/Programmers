class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int abSum = Integer.parseInt(a + "" + b);
        int baSum = Integer.parseInt(b + "" + a);
        
        if(abSum > baSum) {
            answer = abSum;
        } else if(baSum > abSum) {
            answer = baSum;
        } else {
            answer = abSum;
        }
        
        return answer;
    }
}