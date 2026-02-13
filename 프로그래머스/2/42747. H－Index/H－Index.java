import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int hIdx = citations.length - i;
            
            if (citations[i] >= hIdx) {
                return hIdx;
            }
        }
        return 0;
    }

}