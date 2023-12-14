import java.util.*;
class Solution {
    private static final int H = 0;
    private static final int W = 1;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        Integer[] north = {-1, 0};
        Integer[] south = {1, 0};
        Integer[] west = {0, -1};
        Integer[] east = {0, 1};
        Map<String, Integer[]> dirMap = Map.of("N", north, "S", south, "W", west, "E", east); 
        for (int i = 0; i < park.length; i++) {
            int startIndex = park[i].indexOf("S");
            if (startIndex != -1) {
                    answer = new int[]{i, startIndex};
                    break;
            }
        }
        for (String route : routes) {
            String[] routeArr = route.split(" ");
            String direction = routeArr[0];
            int moveCnt = Integer.parseInt(routeArr[1]);
            boolean flag = true;
            int predict = 0;
            for (int k = 1; k <= moveCnt; k++) {
                if (isVertical(direction)) {
                         predict = answer[H] + (dirMap.get(direction)[H] * k);
                    if (predict >= park.length || predict <= -1 || park[predict].charAt(answer[W]) == 'X') 
                        flag = false;
                } else {
                     predict = answer[W] + (dirMap.get(direction)[W] * k);
                    if (predict >= park[H].length() || predict <= -1 || park[answer[H]].charAt(predict) == 'X') 
                        flag = false;
                }
            }
            if (flag)  answer[isVertical(direction) ? H : W] = predict;
        }
        return answer;
    }
     private boolean isVertical(String direction) {
            if ("N".equals(direction) || "S".equals(direction)) {
                return true;
            } 
            return false;
    }
}