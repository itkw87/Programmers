class Solution {
    public int solution(int n) {
        int answer = 0;
        int sumNum = 0;
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            cnt = 0;
            for(int j = 1; j <= i; j++) {
               if(i % j == 0) {
                   cnt++;
               } 
            }
            if(cnt >= 3) {
                sumNum++;
                System.out.println("합성수: " + i);
            }
        }
        
        System.out.println(cnt);
        System.out.println(sumNum);
        answer = sumNum;
        
        return answer;
    }
}