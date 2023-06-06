class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n / slice >=1 && n % slice == 0) {
            answer = n / slice;
        } else {
            if(n / slice >= 1 && n % slice >= 0) {
                answer = n / slice + 1;
            }
            if(n / slice == 0){
                System.out.println("나머지" + n % slice);
                answer = 1;
            }
        }
        
        return answer;
    }
}