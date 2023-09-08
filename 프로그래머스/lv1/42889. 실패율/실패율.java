import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Float> failRateMap = new HashMap();
        for(int i = 1; i <= N; i++) {
            failRateMap.put(i, loswerRate(i, stages));
        }
        ArrayList<Float> valueList = new ArrayList<>(failRateMap.values()); 
        Collections.sort(valueList, Collections.reverseOrder());
        for (int i = 0; i < valueList.size(); i++) {
            for (int j = 1; j <= N; j++) {
                if (valueList.get(i) == failRateMap.get(j)) 
                    answer[i] = j;
            }
        }
        return answer;
    }
    
    public float loswerRate(int nowStage, int[] stages) {
        int cnt = 0;
        int joinCnt = 0;
        for(int i = 0; i < stages.length; i++) {
            if(nowStage == stages[i]) 
                cnt++;
            if(nowStage <= stages[i]) 
                joinCnt++;
        }
        return cnt != 0 && joinCnt != 0 ? (float)cnt / joinCnt : 0;
    } 
}