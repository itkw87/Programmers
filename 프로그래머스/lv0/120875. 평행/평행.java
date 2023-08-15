import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        // 첫번째 열을 기준으로 이차원배열 정렬
        Arrays.sort(dots, Comparator.comparingInt(row -> row[0]));
        ArrayList<int[]> arrList = new ArrayList<>(Arrays.asList(dots));
        HashMap<Double, Integer> slopeMap = new HashMap<>();
        
        while(arrList.size() >= 2) {
            int[] zeroIdxArr = arrList.remove(0);
            int[] oneIdxArr = arrList.remove(0);
            int x = oneIdxArr[0] - zeroIdxArr[0];
            int y = oneIdxArr[1] - zeroIdxArr[1];
            slopeMap.put((double)y / x, slopeMap.getOrDefault((double)y / x, 0) + 1);
        }
        for(int value : slopeMap.values()) {
            if(value >= 2) 
                return 1;
        }
        return 0;
    }
}