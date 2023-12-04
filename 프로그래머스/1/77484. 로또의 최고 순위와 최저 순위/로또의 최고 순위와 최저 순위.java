class Solution {
    private static final int MAX_CNT = 6;
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int answerCnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) 
                    answerCnt++;
            }
        }
        int failCntMaxRank = MAX_CNT - (answerCnt + zeroCnt);  
        int failCntMinRank = MAX_CNT - (answerCnt);  
        return  new int[] {failCntMaxRank > 4 ? 6 : failCntMaxRank + 1, failCntMinRank > 4 ? 6 : failCntMinRank + 1};
    }
}