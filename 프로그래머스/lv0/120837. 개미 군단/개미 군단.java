class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        final int ANT1 = 5;
        final int ANT2 = 3;
        final int ANT3 = 1;
        
        hp = hp % ANT1;
        answer = hp / ANT1;
        if(hp % ANT1 == 0){
            return answer;
        } else {
            hp = hp % ANT2;
            answer = hp / ANT2;
            if(hp % ANT2 == 0) {
                return answer;
            } else {
                hp = hp % ANT3;
                answer = hp / ANT3;
                if(hp % ANT3 == 0) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}