class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        if(hp % 5 == 0) 
            return answer;
        hp = hp % 5;
        
        answer += hp / 3;
        if(hp % 3 == 0) 
            return answer;
        hp = hp % 3;
        
        answer += hp / 1;

        return answer;
    }
}