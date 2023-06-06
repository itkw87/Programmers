class Solution {
    public int solution(int n) {
        int answer = 0;
        final int SEVEN = 7;
        
        int quotient = n / SEVEN;
        int extra = n % SEVEN;
        
        System.out.println(quotient);
        System.out.println(extra);
        
        if(quotient == 0){
            answer = 1;
        } 
        if(quotient >= 1 && extra == 0){
            answer = quotient;
        }
        
        if(quotient >= 1 && extra >= 1){
            answer = quotient + 1;
        }
        
        
        return answer;
    }
}